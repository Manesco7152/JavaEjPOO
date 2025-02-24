package Model;

import java.util.Scanner;

public class Libro {
    String titulo, autor;
    int numPaginas, isbn;

    public Libro() {
    }

    public Libro(String titulo, String autor, int numPaginas, int isbn) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Datos del libro: isbn=" + getIsbn() + ", Titulo=" + getTitulo() + ", Autor=" + getAutor() + ", Numero de Paginas=" + getNumPaginas() + " ";
    }

    public void cargarLibro() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Ingrese la informacion del libro: ");
        System.out.println("Ingrese el ISBN: ");
        setIsbn(sc1.nextInt());
        System.out.println("Ingrese el título: ");
        setTitulo(sc1.nextLine());
        System.out.println("Ingrese el autor: ");
        setAutor(sc1.nextLine());
        System.out.println("Ingrese el numero de paginas: ");
        setNumPaginas(sc1.nextInt());
        sc1.close();
    }
}
