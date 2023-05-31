package colas_hito4;

public class Main {

    public static void main(String[] args) {


        ColaDeNumeros cola1 = new ColaDeNumeros();

        cola1.Adicionar(4);
        cola1.Adicionar(5);
        cola1.Adicionar(6);
        cola1.Adicionar(46);
        cola1.Adicionar(5);
        cola1.Adicionar(54);

        //cola1.Mostrar();
        //multiplosDe3(cola1, 3);
        //ElimininarElementosRepetidos(cola1);
        //verificaSiExisteUnoMas(cola1, 100);
        //EliminarREpetidos(cola1);
        //Ejercicio 2: Hecho por el ingeniero
        //EliminarRepetidos_v2(cola1);

        //Metodo para verificar repetidos (Heecho por el ingeniero)
        verificaRepetidos(cola1,6);;

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


    public static void EliminarRepetidos_v2(ColaDeNumeros cola) {
        int nroElem ;
        int comp = cola.nroElem();
        int item ;
        int repetido =1;

        while (repetido >0 ){
            repetido = 0;
            nroElem = cola.nroElem();

            for (int i = 1; i <= nroElem; i++) {
                item = cola.eliminar();
                if(verificaRepetidos(cola,item) == true){
                    repetido = item;
                }
                cola.Adicionar(item);

            }

            for (int i = 1; i < nroElem; i++) {
                item = cola.eliminar();
                if (item != repetido){
                    cola.Adicionar(item);
                }

            }
        }
        System.out.println(cola.nroElem());

        cola.Mostrar();
        int nume = 0 ;
        if ( cola.nroElem() % 2 ==0){
            while (nume  < cola.nroElem()+1 ){
                item = cola.eliminar();
                cola.Adicionar(item);
                nume++;
            }
        }
        else{
            while (nume  <= cola.nroElem()+2 ){
                item = cola.eliminar();
                cola.Adicionar(item);
                nume++;
            }
        }


        cola.Mostrar();

    }

    public static boolean verificaRepetidos(ColaDeNumeros cola, int num){
        int cont =0;
        int item =0;
        int numElem = cola.nroElem();

        for (int i = 1; i <= numElem; i++){
            item = cola.eliminar();
            if(item == num){
                cont++;
            }
            cola.Adicionar(item);
        }

        if(cont > 0){
            return true;
        }
        else{
            return false;
        }
    }
}


