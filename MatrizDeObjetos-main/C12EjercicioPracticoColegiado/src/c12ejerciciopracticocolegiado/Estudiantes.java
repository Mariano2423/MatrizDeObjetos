/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c12ejerciciopracticocolegiado;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Estudiantes {
    //Definimos los atributos de nuestro objeto
    String nombre;
    String curso;
    String profesor;
    double calificacion;
      
    //Creamos los constructores, getters y setters
    public Estudiantes(String nombre, String curso, String profesor, double calificacion) {
        this.nombre = nombre;
        this.curso = curso;
        this.profesor = profesor;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    //Creamos el método para obtener datos, y asignamos los datos obtenidos al arreglo.
    public void obtenerDatos(Estudiantes[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            JOptionPane.showMessageDialog(null, "Estudiante " + (i+1) + "");
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
            String curso = JOptionPane.showInputDialog("Ingrese el nombre del curso: ");
            String profesor = JOptionPane.showInputDialog("Ingrese el nombre del profesor: ");
            double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificacion obtenida por el estudiante: "));
            arreglo[i] = new Estudiantes(nombre, curso, profesor, calificacion);
        }
    }
    //Creamos el metodo para mostrar toda la información obtenida anteriormente.
    public void listadoEstudiantes(Estudiantes[] arrEstudiantes){
        JOptionPane.showMessageDialog(null, "A continuación se mostrarán los mejores 10 estudiantes de la Escuela del Programador");
        for (int i = 0; i < arrEstudiantes.length; i++) {
            JOptionPane.showMessageDialog(null, 
                "Estudiante #" + (i+1) + ":\n"
                + "Nombre: " + arrEstudiantes[i].nombre + "\n"
                + "Curso: " + arrEstudiantes[i].curso + "\n"
                + "Profesor: " + arrEstudiantes[i].profesor + "\n"
                + "Calificacion: " + arrEstudiantes[i].calificacion);
        }
        
    }
    //Creamos el metodo para obtener la mayor nota de todas las calificaciones obtenidas
     public void mayorNota(Estudiantes[] arrEstudiantes){
         double mayorCalif = arrEstudiantes[0].calificacion;
         String mayorEstud = arrEstudiantes[0].nombre;
         for (int i = 0; i < arrEstudiantes.length; i++) {
             if(arrEstudiantes[i].calificacion > mayorCalif){
                 mayorCalif = arrEstudiantes[i].calificacion;
                 mayorEstud = arrEstudiantes[i].nombre;
             }
         }
         JOptionPane.showMessageDialog(null, "La mayor nota obtenida fue de: " + mayorCalif + " por el estudiante " + mayorEstud);
    }
     //Creamos el metodo para obtener la menor nota de todas las calificaciones obtenidas
     public void menorNota(Estudiantes[] arrEstudiantes){
         double menorCalif = arrEstudiantes[0].calificacion;
         String menorEstud = arrEstudiantes[0].nombre;
         for (int i = 0; i < arrEstudiantes.length; i++) {
             if(arrEstudiantes[i].calificacion < menorCalif){
                 menorCalif = arrEstudiantes[i].calificacion;
                 menorEstud = arrEstudiantes[i].nombre;
             }
         }
         JOptionPane.showMessageDialog(null, "La menor nota obtenida fue de: " + menorCalif + " por el estudiante " + menorEstud);
    }
     //Creamos el metodo para obtener el promedio de las notas obtenidas, y la cantidad de calificaciones por encima y por debajo de este promedio
     public void promedioNotas(Estudiantes[] arrEstudiantes){
         double suma = 0;
         double promedio = 0;
         for (int i = 0; i < arrEstudiantes.length; i++) {
             suma += arrEstudiantes[i].calificacion;
             
         }
         promedio = suma / 10;
         JOptionPane.showMessageDialog(null, "El promedio de calificaciones fue de: " + promedio);
         int contArribaPromedio = 0;
         int contAbajoPromedio = 0;
         
         for (int i = 0; i < arrEstudiantes.length; i++) {
             if (arrEstudiantes[i].calificacion > promedio){
                 contArribaPromedio += 1;
             } else if (arrEstudiantes[i].calificacion < promedio){
                 contAbajoPromedio += 1;
             }
         }
         JOptionPane.showMessageDialog(null, "El promedio de calificaciones fue de: " + promedio + "\n" +
          "La cantidad de calificaciones por encima del promedio fue de: " + contArribaPromedio + "\n"
         + "y la cantidad de calificaciones por debajo del promedio fue de: " + contAbajoPromedio);
     }
}
