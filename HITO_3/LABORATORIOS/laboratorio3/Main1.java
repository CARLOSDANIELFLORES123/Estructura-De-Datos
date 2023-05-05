package PilaDeCadenas;

public class Main1 {
    public static void main(String[] args) {
        PilaDeCadenas pila1 = new PilaDeCadenas(10);

        pila1.Adicionar("William");
        pila1.Adicionar("Andres");
        pila1.Adicionar("josias");
        pila1.Adicionar("Iris");
        pila1.Adicionar("jonathan");
        pila1.Adicionar("ilia");

        // pila1.mostrar();
//        pila1.llenar(11);
//        pila1.mostrar();

        //contarandres(pila1,"Andres");
//        //ingresarnuevonobreen3posicion(pila1,"Andres","Ana");
//        pila1.mostrar();
//        cambiodelugardeitems(pila1);
        pila1.mostrar();
        ingresarnuevonobreen3posicionjosias(pila1);
        pila1.mostrar();

    }

    public static void contarandres(PilaDeCadenas pila, String nombre) {
        int cont=0;
        String nombreelim = "";
        PilaDeCadenas aux = new PilaDeCadenas(10);

        while (!pila.esVacio()){
            nombreelim = pila.eliminar();
            if(nombreelim.equals(nombre)){
                cont = cont+1;
            }
            aux.Adicionar(nombreelim);
        }
        pila.vaciar(aux);
        System.out.println("hay: "+cont+" "+nombre);
    }
    public static void ingresarnuevonobreen3posicion(PilaDeCadenas pila , String nombre, String newnombre){

        String nombreelim = "";
        PilaDeCadenas aux = new PilaDeCadenas(10);

        while (!pila.esVacio()){
            nombreelim = pila.eliminar();
            if(nombreelim.equals(nombre)){
                aux.Adicionar(newnombre);
            }
            aux.Adicionar(nombreelim);
        }
        pila.vaciar(aux);

    }

    public static void cambiodelugardeitems(PilaDeCadenas pila){

        PilaDeCadenas aux = new PilaDeCadenas(10);
        String nombre1 = pila.eliminar();
        aux.vaciar(pila);
        String nombre2 = aux.eliminar();

        pila.Adicionar(nombre1);
        pila.vaciar(aux);
        pila.Adicionar(nombre2);


    }

    public static void ingresarnuevonobreen3posicionjosias(PilaDeCadenas pila ){

        String nombreelim = "";
        String nombre = "";
        PilaDeCadenas aux = new PilaDeCadenas(10);

        while (!pila.esVacio()){
            System.out.println(pila.nroElem());
            nombreelim = pila.eliminar();

            if(pila.nroElem()==2){
                nombre = nombreelim;
            }
            else{
                aux.Adicionar(nombreelim);
            }


        }

        pila.vaciar(aux);
        pila.Adicionar(nombre);


    }

}



