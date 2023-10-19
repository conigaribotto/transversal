
package transversal.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import transversal.Entidades.Alumno;
import transversal.Entidades.Inscripcion;
import transversal.Entidades.Materia;


public class InscripcionData {
    private Connection con = null;
    private MateriaData md=new MateriaData();
    private AlumnoData ad = new AlumnoData();
    
    public InscripcionData(){
    con = Conexion.getConexion();
    }
    
    public void guardarInscripcion(Inscripcion insc) {

        String sql = "INSERT INTO inscripcion(idAlumno, idMateria, nota) VALUES (?,?,?) ";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.setDouble(3, insc.getNota());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion Registrada.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion.");
        }
    }
       

    public void actualizarNota(int idAlumno, int idMateria, double nota) {

        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? and idMateria = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);

            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Nota actualizada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion.");
        }

    }
    
    public void borrarInscripcion(int idAlumno, int idMateria) {
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? and idMateria = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);

            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Inscripcion borrada con exito.");
            }
             ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion.");
        }

    }
    
    public List<Inscripcion> obtenerInscripciones() {

        ArrayList<Inscripcion> cursadas = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumno alu = ad.buscarAlumnoPorId(rs.getInt("idAlumno"));
                Materia mat = md.buscarMateriaPorId(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("nota"));
                cursadas.add(insc);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar lista de inscripciones.");
        }
        return cursadas;
    }

}

