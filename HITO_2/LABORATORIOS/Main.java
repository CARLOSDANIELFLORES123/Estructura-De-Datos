package ManejoDePilas;

public class Main {
    public static void main(String[] args) {
        int [] edades = new int[5];
        edades [0] = 33;
        edades [1] = 20;
        edades [2] = 19;
        edades [3] = 42;
        edades [4] = 33;
        Edades obj1 = new Edades("Unifranz" ,"EDD", edades);
        obj1.mostrar();

        //Determinar la edad mayor

    }
    public static void DeterminarEdadMayor(Edades obj1){
        int[] edades = obj1.getEdades();
        int mayorEdad = edades[0];

        for ( int i = 1;i<edades.length; i++){
            if (edades[1]> mayorEdad){
                mayorEdad = edades[i];
            }
        }

        System.out.println("Edad Mayor:"+ mayorEdad);


    }
    // suma mas 5 a los pares
    public static void sumaEdadesPares5(Edades obj1){
        int [] edades = obj1.getEdades();

        for (int i=1; i < edades.length; i++){
            if (edades[i] % 2 == 0){
                edades[i] = edades[i] + 5;
            }
        }
        obj1

    }

}
