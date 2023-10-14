package transversal.TestMain;

import java.sql.Connection;
import java.time.LocalDate;
import transversal.AccesoADatos.AlumnoData;
import transversal.AccesoADatos.Conexion;
import transversal.AccesoADatos.MateriaData;
import transversal.Entidades.Alumno;
import transversal.Entidades.Materia;

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
 
 
 
 
 
        ///////////PRUEBAS CON MateriaData :):):):):):)/////////////
        
        
        
         /* ---------INSERT materia--------- 
       Materia materia = new Materia(105,"Geografia",2023,true); //en memoria ram
       MateriaData materiaData = new MateriaData();
       materiaData.guardarMateria(materia); //en BD
        */
         
/* ---------UPDATE materia--------- //POR ALGUNA RAZON NO FUNCIONA, REVISARRRRRRRRRR
       Materia materia = new Materia(105,"Matematica",2023,true); //cambio nombre
       MateriaData materiaData = new MateriaData();
       materiaData.modificarMateria(materia);
         */
         
 /* ---------ELIMINAR materia--------- 
       MateriaData materiaData = new MateriaData();
       materiaData.eliminarMateria(105); //id de alum
         */
 /* ---------SELECT materia--------- busco una materia por ID 
        MateriaData materiaData = new MateriaData();
        Materia materiaEncontrada = materiaData.buscarMateriaPorId(100); //verificar que este ese id en bd
        if (materiaEncontrada != null) {
            System.out.println("Nombre: " + materiaEncontrada.getNombre() + " Anio: " + materiaEncontrada.getAnioMateria());
        }
         */

 /* ---------SELECT materia--------- busco Todos las materias
        MateriaData materiaData = new MateriaData();
        
        for(Materia materia:materiaData.listarMaterias()){
            System.out.println("");
            System.out.println("Nombre: " + materia.getNombre());
            System.out.println("Anio: "+ materia.getAnioMateria()); 
        }
         */
    }
}
