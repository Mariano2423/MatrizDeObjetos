/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c12ejerciciopracticocolegiado;

/**
 *
 * @author Aulas Heredia
 */
public class C12EjercicioPracticoColegiado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*
        Creamos una instancia de la cual llamaremos los métodos para poder mostrar la información
     y solicitar la respectiva información, además, creamos el arreglo de objetos y llamamos los métodos que creamos anteriormente con el arreglo como iniciador.
     */
     Estudiantes estudiante = new Estudiantes("Andy","Progra","David",100.00); 
     Estudiantes[] arrEstudiantes = new Estudiantes[2];
     
     estudiante.obtenerDatos(arrEstudiantes);
     estudiante.listadoEstudiantes(arrEstudiantes);
     estudiante.mayorNota(arrEstudiantes);
     estudiante.menorNota(arrEstudiantes);
     estudiante.promedioNotas(arrEstudiantes);
    }
}
