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
       Alumno alum = new Alumno(44360475,"Lionel","Messi",LocalDate.of(1987, 24, 06),true); //en memoria ram
       AlumnoData alumData = new AlumnoData();
       alumData.guardarAlumno(alum); //en BD
         */
 /* ---------UPDATE alumno--------- 
       Alumno alum = new Alumno(10,44360475,"Lionel","Andres Messi",LocalDate.of(1987, 24, 06),true); //add idAlumno, cambio nombre
       AlumnoData alumData = new AlumnoData();
       alumData.modificarAlumno(alum);
         */
 /* ---------ELIMINAR alumno--------- 
       Alumno alum = new Alumno(10,44360475,"Lionel","Andres Messi",LocalDate.of(1987, 24, 06),true); //add idAlumno, cambio nombre
       AlumnoData alumData = new AlumnoData();
       alumData.eliminarAlumno(10); //id de alum
         */
 /* ---------SELECT alumno--------- busco un alumno por ID 
        AlumnoData alumData = new AlumnoData();
        Alumno alumnoEncontrado = alumData.buscarAlumnoPorId(4); //verificar que este ese id en bd
        if (alumnoEncontrado != null) {
            System.out.println("Dni: " + alumnoEncontrado.getDni() + " Apellido: " + alumnoEncontrado.getApellido());
        }
         */
 /* ---------SELECT alumno--------- busco un alumno por DNI 
        AlumnoData alumData = new AlumnoData();
        Alumno alumnoEncontrado = alumData.buscarAlumnoPorDni(33333); //verificar que este ese dni en bd
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
