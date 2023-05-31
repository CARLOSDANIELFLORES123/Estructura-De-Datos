package colas_hito4;

public class Main {

    public static void main(String[] args) {


        ColaDeNumeros cola1 = new ColaDeNumeros();

        cola1.Adicionar(4);
        cola1.Adicionar(6);
        cola1.Adicionar(8);
        cola1.Adicionar(4);
        cola1.Adicionar(4);
        cola1.Adicionar(100);

        //cola1.Mostrar();
        multiplosDe3(cola1, 3);
        //ElimininarElementosRepetidos(cola1);
        //verificaSiExisteUnoMas(cola1, 100);
        //EliminarREpetidos(cola1);

    }

    public static void multiplosDe3(ColaDeNumeros cola, int multiplo) {
        int contador = 0;
        int numElim;

        ColaDeNumeros aux = new ColaDeNumeros();

        while (cola.esVacia() == false) {

            numElim = cola.eliminar();
            if (numElim % multiplo == 0) {
                contador += 1;
            }
            aux.Adicionar(numElim);
        }
        cola.Vaciar(aux);
        System.out.println("Hay " + contador + " multiplos de " + multiplo + " en la cola");

    }

    public static void EliminarREpetidos(ColaDeNumeros cola) {
        ColaDeNumeros aux = new ColaDeNumeros();
        ColaDeNumeros aux2 = new ColaDeNumeros();
        ColaDeNumeros cola2 = new ColaDeNumeros();
        ColaDeNumeros colacontenedo = new ColaDeNumeros();

        int num;
        int num2;
        int max = 0;
        int repetido = 0;

        cola2 = cola;
        colacontenedo = cola;

        while (cola.esVacia() == false) {
            num = cola.eliminar();

            while (cola2.esVacia() == false) {
                num2 = cola2.eliminar();
                if (num2 == num) {
                    repetido = num2;
                }
            }
            aux.Adicionar(num);
        }


        cola = colacontenedo;

        while (cola.esVacia() == false) {
            num = cola.eliminar();

            if (num != repetido) {
                aux2.Adicionar(num);
            }

        }

        cola.Vaciar(aux2);

        cola.Mostrar();
    }


}


