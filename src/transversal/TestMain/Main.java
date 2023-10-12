package transversal.TestMain;

import java.sql.Connection;
import java.time.LocalDate;
import transversal.AccesoADatos.AlumnoData;
import transversal.AccesoADatos.Conexion;
import transversal.Entidades.Alumno;

public class Main {

    public static void main(String[] args) {
        // Connection con = Conexion.getConexion();

        /*  ---------INSERT alumno--------- 
       Alumno alum = new Alumno(44360475,"Messi","Lionel",LocalDate.of(1987, 06, 24),true); //en memoria ram
       AlumnoData alumData = new AlumnoData();
       alumData.guardarAlumno(alum); //en BD
         */
 /* ---------UPDATE alumno--------- 
       Alumno alum = new Alumno(1,44360475,"Messi","Andres Lionel",LocalDate.of(1987, 06, 24),true); //cambio nombre
       AlumnoData alumData = new AlumnoData();
       alumData.modificarAlumno(alum);
     */    
         
 /* ---------ELIMINAR alumno--------- 
       Alumno alum = new Alumno(1,44360475,"Messi","Andres Lionel",LocalDate.of(1987, 06, 24),true);
       AlumnoData alumData = new AlumnoData();
       alumData.eliminarAlumno(10); //id de alum
         */
 /* ---------SELECT alumno--------- busco un alumno por ID 
        AlumnoData alumData = new AlumnoData();
        Alumno alumnoEncontrado = alumData.buscarAlumnoPorId(1); //verificar que este ese id en bd
        if (alumnoEncontrado != null) {
            System.out.println("Dni: " + alumnoEncontrado.getDni() + " Apellido: " + alumnoEncontrado.getApellido());
        }
         */
 /* ---------SELECT alumno--------- busco un alumno por DNI 
        AlumnoData alumData = new AlumnoData();
        Alumno alumnoEncontrado = alumData.buscarAlumnoPorDni(44360475); //verificar que este ese dni en bd
        if (alumnoEncontrado != null) {
            System.out.println("Dni: " + alumnoEncontrado.getDni() + " Apellido: " + alumnoEncontrado.getApellido());
        }
         */
 /* ---------SELECT alumno--------- busco Todos los alumnos
        AlumnoData alumData = new AlumnoData();
        
        for(Alumno alumno:alumData.listarAlumnos()){
            System.out.println("");
            System.out.println("Dni: "+alumno.getDni());
            System.out.println("Apellido: "+alumno.getApellido());
            System.out.println("Nombre: "+alumno.getNombre());
            System.out.println("Fecha de nacimiento: "+alumno.getFechaNac()); 
        }
         */
    }
}
