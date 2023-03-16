package Ejercisios;

public class Ejercisio {

    private int i;
    private int limite;


    public Ejercisio(){
        this.i=1;
        this.limite=10;
    }

    public void mostrarMensaje(){

        System.out.println("Hola mundo java");
    }

    public void generarNumerosNaturales() {

        System.out.println("!generando numeros anturales con for");
        for (int i = 1; i < 11; i++) {

            System.out.println("i:" + i);

        }

    }

    public void generarNumerosPares() {
        System.out.println("!generando numeros pares con for");
        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {
                System.out.println(i);

            }
        }


    }


    public void generarNumerosNaturalesWhile() {


        System.out.println("!generando numeros anturales con while");
        int i;
        i = 0;
        while (i <= 5) {

            System.out.println(i);
            i = i + 1;
        }

    }
}
