package ejercicios;

public class Ejercicios {
    private int i;
    private int limite;

    public Ejercicios() {
        this.i = 1;
        this.limite = 10;

    }

    public void mostrarMensaje() {
        System.out.println("Hola Mundo Desde Java");
    }

    public void generarNumerosNaturalesFOR() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Numero: " + i);
        }
    }

    public void GenerarNumerosParesFOR() {
        for (int i = 2; i <= 20; i = i + 2) {
            System.out.print(i + ",");
        }
    }

    public void GenerarNumerosNaturalesWHILE() {
        int i = 2;
        while (i <= 10) {
            System.out.print(i + ",");
            i = i + 2;
        }
    }




}
