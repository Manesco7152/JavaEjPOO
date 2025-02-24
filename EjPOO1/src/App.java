/*
Crear un package llamado Models dentro de src.
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. 
**Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */

import Model.Libro;

public class App {
    public static void main(String[] args) throws Exception {
        Libro op = new Libro();
        op.cargarLibro();
        System.out.println("------------------------------");
        System.out.println(op.toString());
    }
}
