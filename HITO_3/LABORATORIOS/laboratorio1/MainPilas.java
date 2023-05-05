package ManejoDePilas;

public class MainPilas {
    public static void main (String[] args ){

        Pilanumeros p1 = new Pilanumeros( 10 );

        p1.Adicionar(10);
        p1.Adicionar(2);
        p1.Adicionar(5);
        p1.Adicionar(23);
        p1.Adicionar(100);

        p1.Mostrar();
        DeterminamuestraNumeroMayor(p1);
        DeterminamuestraNumeroMenor(p1);
        DeterminarParesImpares(p1);
        nuevaPosicion(p1 , 5);
        AgregarPosicion(p1 , 100);

    }

    // este metodo me permite obtener el mayor de la pila de numeros
    public static void DeterminamuestraNumeroMayor (Pilanumeros pila) {

        Pilanumeros aux = new Pilanumeros(10);
        int mayor = -1;
        int valorExtraidoDelaPila = 0;

        while(pila.esVacio()==false){

            valorExtraidoDelaPila = pila.eliminar();
            if(valorExtraidoDelaPila > mayor){

                mayor = valorExtraidoDelaPila;
            }

            aux.Adicionar(valorExtraidoDelaPila);

        }

        pila.Vaciar(aux);

        System.out.println("el numero mayor es: " + mayor );

    }

    public static void DeterminamuestraNumeroMenor (Pilanumeros pila) {

        Pilanumeros aux = new Pilanumeros(10);
        int menor = 50;
        int valorExtraidoDelaPila = 0;

        while (pila.esVacio() == false) {

            valorExtraidoDelaPila = pila.eliminar();
            if (valorExtraidoDelaPila < menor) {

                menor = valorExtraidoDelaPila;
            }

            aux.Adicionar(valorExtraidoDelaPila);


        }

        pila.Vaciar(aux);

        System.out.println("el numero menor es: " + menor);


    }

    public static void DeterminarParesImpares (Pilanumeros pila) {

        Pilanumeros aux = new Pilanumeros(10);
        int par =0;
        int impar=0;
        int valorExtraidoDelaPila = 0;

        while (pila.esVacio() == false) {

            valorExtraidoDelaPila = pila.eliminar();
            if (valorExtraidoDelaPila % 2 == 0) {

                par = par + 1;


            }else{

                impar = impar +1;
            }

            aux.Adicionar(valorExtraidoDelaPila);


        }

        pila.Vaciar(aux);

        System.out.println("los pares son: "+par );
        System.out.println("los pares son: "+impar );


    }

    public static void nuevaPosicion(Pilanumeros pila, int elemento ){

        Pilanumeros aux = new Pilanumeros(10);
        int valorExtraidoDelaPila = 0;
        while (pila.esVacio() == false){

            valorExtraidoDelaPila = pila.eliminar();
            if (valorExtraidoDelaPila != elemento){

                aux.Adicionar(valorExtraidoDelaPila);
            }


        }
        pila.Vaciar(aux);
        pila.Adicionar(elemento);
        pila.Mostrar();


    }
    public static void AgregarPosicion(Pilanumeros pila, int elemento ){

        Pilanumeros aux = new Pilanumeros(10);
        int valorExtraidoDelaPila = 0;
        while (pila.esVacio() == false){

            valorExtraidoDelaPila = pila.eliminar();
            if (valorExtraidoDelaPila != elemento){

                aux.Adicionar(valorExtraidoDelaPila);
            }


        }
        pila.Vaciar(aux);
        pila.Adicionar(elemento);
        pila.Mostrar();

    }
}
