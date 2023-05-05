package PilaDeLibros;

public class Main {
    public static void main(String[] args) {

        Libro lib1 = new Libro(" La odisea ", " Homero ", 40, 20.50, " Novela ");
        Libro lib2 = new Libro(" DBA I ", " Saul ", 50, 45.50, " Base de Datos ");
        Libro lib3 = new Libro(" DBA II ", " Ana ", 60, 41.50, " Base de Datos II ");
        Libro lib4 = new Libro(" Progra Intro ", " Micaela ", 70, 32.50, " Logica ");
        Libro lib5 = new Libro(" Analisis y diseño ", " Juan ", 80, 56.50, " Analisis ");

        PilaDeLibros plibros = new PilaDeLibros(10);

        plibros.Adicionar(lib1);
        plibros.Adicionar(lib2);
        plibros.Adicionar(lib3);
        plibros.Adicionar(lib4);
        plibros.Adicionar(lib5);


        DeterminarMayor(plibros, 50);
        cambiosentido(plibros );

    }

    //determinar cuanto libros tiene una cantidad de paginas mayor a 50
    public static void DeterminarMayor(PilaDeLibros libros, int Nropaginas) {

        PilaDeLibros aux = new PilaDeLibros(10);
        int Cont = 0;
        Libro libroEliminado = null;

        while (libros.esVacio() == false) {

            libroEliminado = libros.eliminar();
            if (libroEliminado.getNroPag() > Nropaginas) {

                Cont = Cont + 1;
            }

            aux.Adicionar(libroEliminado);

        }

        libros.Vaciar(aux);

        System.out.println("la cantidad de libros mayores a 50 paginas es: " + Cont);

    }

    //tenemos 5 libros cambiar del ultimo al principio

    public static void cambiosentido(PilaDeLibros pila) {

        PilaDeLibros aux = new PilaDeLibros(10);
        Libro ultimolibroeliminado = pila.eliminar();
        Libro libroeliminado = null;
        Libro primerlibroeliminado = null;
        while (pila.esVacio() == false) {

            libroeliminado = pila.eliminar();
            aux.Adicionar(libroeliminado);

        }
        primerlibroeliminado = aux.eliminar();
        pila.Adicionar(ultimolibroeliminado);
        pila.Vaciar(aux);
        pila.Adicionar(primerlibroeliminado);
        pila.Mostrar();

    }
}

