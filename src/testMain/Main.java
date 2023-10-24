package testMain;

import java.sql.Connection;
import java.time.LocalDate;
import accesoADatos.AlumnoData;
import accesoADatos.Conexion;
import accesoADatos.InscripcionData;
import accesoADatos.MateriaData;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;

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
 /*// ---------UPDATE materia--------- //POR ALGUNA RAZON NO FUNCIONA, REVISARRRRRRRRRR
       Materia materia = new Materia(105,"Alfiiiin",2023,true); //cambio nombre
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
        ////PRUEBAS InscripcionData :)
        AlumnoData ad = new AlumnoData();
        MateriaData md = new MateriaData();
        InscripcionData id = new InscripcionData();

        Alumno Lionel = ad.buscarAlumnoPorId(2);
        Materia Historia = md.buscarMateriaPorId(103);
        Inscripcion insc = new Inscripcion(Lionel, Historia, 10);
        
        /* id.guardarInscripcion(insc);*/
        ///UPDATE NOTA 
        //  id.actualizarNota(4, 103, 10);
        //DELETE INSCRIPCION 
        //id.borrarInscripcion(5, 104);

        /* ///LISTA OBTENER INSCRIPCION
        for (Inscripcion inscripcion : id.obtenerInscripciones()) {
                  System.out.println("id "+ inscripcion.getIdInscripcion());
                  System.out.println("Apellido "+ inscripcion.getAlumno().getApellido());
                  System.out.println("Materia "+ inscripcion.getMateria().getNombre());
        }*/
 /* ///LISTA OBTENER INSCRIPCION x alumno
        for (Inscripcion inscripcion : id.obtenerInscripcionesPorAlumno(2)) {
                  System.out.println("id "+ inscripcion.getIdInscripcion());
                  System.out.println("Apellido "+ inscripcion.getAlumno().getApellido());
                  System.out.println("Materia "+ inscripcion.getMateria().getNombre());
        }*/
//        ///LISTA OBTENER Materias NO Cursadas
//        for (Materia materia : id.obtenerMateriasNOCursadas(2)) {
//            System.out.println("nombre: " + materia.getNombre());
//
//        }
    ///LISTA OBTENER Materias NO Cursadas
        for (Alumno alumno : id.obtenerAlumnosXMateria(103)) {
            System.out.println("Alumno: " + alumno.getNombre()+" "+alumno.getApellido());

        }
    }
}
