package pilas;

public class Main {

    //PSVM
    public static void main(String[] args) {

/*
        int[] edades = new int[5];
        edades[0] = 33;
        edades[1] = 20;
        edades[2] = 19;
        edades[3] = 22;
        edades[4] = 25;
        Edades obj1 = new Edades("Unifranz","EDD",edades);

            //DETERMINAR LA EDAD MAYOR
        determinaEdadMayor(obj1);
        determinaPar5(obj1);
        obj1.mostrar();
    }
    public static void determinaEdadMayor(Edades obj1){
        int[] edades =obj1.getEdades();
        int mayor = edades[0];
        for (int i =1 ; i< edades.length ; i++){

            if(edades[i]> mayor){
                mayor = edades[i];
            }


        }
        System.out.println("resultado: "+ mayor);

    }
    public static void determinaPar5(Edades obj1){
        int[] edades =obj1.getEdades();


        for (int i =0 ; i< edades.length ; i++){

            if(edades[i] % 2 == 0){
                edades[i] = edades[i]+5;

            }
        }

        obj1.setEdades(edades);
*/

        int[] edades1 = new int[5];
        edades1[0] = 33;
        edades1[1] = 19;
        edades1[2] = 20;
        edades1[3] = 42;
        edades1[4] = 25;
        int[] edades2 = new int[5];
        edades2[0] = 30;
        edades2[1] = 20;
        edades2[2] = 19;
        edades2[3] = 15;
        edades2[4] = 25;
        Edades1 obj1 = new Edades1("Unifranz", "ADD", edades1);
        Edades2 obj2 = new Edades2("Unifranz", "DBA_III", edades2);

        obj1.mostrar1();
        obj2.mostrar2();
        intercambioValores(obj1, obj2);
        obj1.mostrar1();
        obj2.mostrar2();
        determinaEdadMayor(obj1);
        intercambioValores(obj1,obj2);
    }
    public static int determinaEdadMayor(Edades1 obj1){
        int[] edades =obj1.getEdades1();
        int mayor = edades[0];
        for (int i =1 ; i< edades.length ; i++){

            if(edades[i]> mayor){
                mayor = edades[i];
            }


        }
        System.out.println("resultado: "+ mayor);
        return mayor;
    }
    public static int determinaEdadMayor(Edades2 obj2){
        int[] edades =obj2.getEdades2();
        int mayor = edades[0];
        for (int i =1 ; i< edades.length ; i++){

            if(edades[i]> mayor){
                mayor = edades[i];
            }


        }
        System.out.println("resultado: "+ mayor);
        return mayor;
    }
    public static int determinaEdadMenor(Edades2 obj2){
        int[] edades =obj2.getEdades2();
        int menor = edades[0];
        for (int i =1 ; i< edades.length ; i++){

            if(edades[i]< menor){
                menor = edades[i];
            }


        }
        System.out.println("resultado: "+ menor);
        return menor;
    }
    public static int determinaEdadMenor(Edades1 obj1){
        int[] edades =obj1.getEdades1();
        int menor = edades[0];
        for (int i =1 ; i< edades.length ; i++){

            if(edades[i]< menor){
                menor = edades[i];
            }


        }
        System.out.println("resultado: "+ menor);
        return menor;
    }
    public static void intercambioValores(Edades1 obj1, Edades2 obj2) {

        int mayorEdd = determinaEdadMayor(obj1);
        int menorEdd = determinaEdadMenor(obj1);
        int a=0, c=0;

        System.out.println(" amayor edad par EDD: " + mayorEdd);
        int mayorDBA = determinaEdadMayor(obj2);
        int menorDBA = determinaEdadMenor(obj2);
        System.out.println(" amayor edad par EDD: " + mayorDBA);

        int[] edadesEDD = obj1.getEdades1();
        int[] edadesBDA = obj2.getEdades2();

        for(int i = 0; i < edadesEDD.length;i++){
            if(edadesEDD[i] == menorEdd) {
                a = i;
            }



        }
        System.out.println(a);
        for(int i = 0; i < edadesEDD.length;i++){

            if(edadesEDD[i] == mayorEdd){

                c = i;
                edadesEDD[a] = mayorEdd;

            }
        }
        for(int i = 0; i < edadesEDD.length;i++){

            if(edadesEDD[i] == mayorEdd){

                edadesEDD[c] = menorEdd;


            }
        }







/*
        for(int i = 0; i < edadesBDA.length;i++){
            if(edadesBDA[i] == mayorDBA){
                edadesBDA[i] = mayorEdd;
            }
        }
        for(int i = 0; i < edadesEDD.length;i++){
            if(edadesEDD[i] == mayorEdd){
                edadesEDD[i] = mayorDBA;
            }
        }
        for(int i = 0; i < edadesBDA.length;i++){
            if(edadesBDA[i] == menorDBA){
                edadesBDA[i] = menorEdd;
            }
        }
        for(int i = 0; i < edadesEDD.length;i++){
            if(edadesEDD[i] == menorEdd){
                edadesEDD[i] = menorDBA;
            }
        }

      */



        /*


        int[] edades1 = obj1.getEdades1(), edades2 = obj2.getEdades2();
        int myr1 = edades1[0], mnr1 = edades1[0];
        int myr2 = edades2[0], mnr2 = edades2[0];

        for (int i = 0; i < edades1.length; i++) {
            if (edades1[i] > myr1) {
                myr1 = edades1[i];
            }
            if (edades1[i] < mnr1) {
                mnr1 = edades1[i];
            }
        }

        for (int i = 0; i < edades2.length; i++) {
            if (edades2[i] > myr2) {
                myr2 = edades2[i];
            }
            if (edades2[i] < mnr2) {
                mnr2 = edades2[i];
            }
        }


        for (int i = 0; i < edades1.length; i++) {
            if (edades1[i] == mnr1) {
                edades1[i] = mnr2;
            }
            if (edades1[i] == myr1) {
                edades1[i] = myr2;
            }
        }
        obj1.setEdades1(edades1);

        for (int i = 0; i < edades2.length; i++) {
            if (edades2[i] == mnr2) {
                edades2[i] = mnr1;
            }
            if (edades2[i] == myr2) {
                edades2[i] = myr1;
            }
        }
        obj2.setEdades2(edades2);
*/
    }
}

