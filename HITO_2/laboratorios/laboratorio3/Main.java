package pilas;

public class Main {
    public static void main(String[] args) {
/*
       int [] edades = new int[5];
       edades[0]=33;
       edades[1]=20;
       edades[2]=19;
       edades[3]=22;
       edades[4]=25;
       Edades obj1 = new Edades("Unifranz","EDD",edades);
        obj1.mostrar();
       determinarEdadMayor(obj1);
       determinarPar5(obj1);
        obj1.mostrar();
    }
    public static void determinarEdadMayor(Edades obj1){
        int[] edades =  obj1.getEdades();
        int myr = edades [0];
        for(int i=1;i<edades.length;i++){
            if( edades[i]>myr){
                myr = edades[i];
            }
        }
        System.out.println("resultado: "+ myr);
    }
    public static void determinarPar5(Edades obj1){
        int[] edades = obj1.getEdades();
        for(int i = 1; i<edades.length;i++){
            if(edades[i]%2==0){
                edades[i]=edades[i]+5;
            }
        }
        obj1.setEdades(edades);
    }
*/
        int[] edades1 = new int[5];
        edades1[0] = 33;
        edades1[1] = 20;
        edades1[2] = 19;
        edades1[3] = 42;
        edades1[4] = 25;
        int[] edades2 = new int[5];
        edades2[0] = 30;
        edades2[1] = 20;
        edades2[2] = 19;
        edades2[3] = 15;
        edades2[4] = 25;
        Edades1 obj1 = new Edades1("Unifranz","ADD",edades1);
        Edades2 obj2 = new Edades2("Unifranz","DBA_III",edades2);

        obj1.mostrar1();
        obj2.mostrar2();
        intercambioValores(obj1,obj2);
        obj1.mostrar1();
        obj2.mostrar2();

    }
    public static void intercambioValores(Edades1 obj1, Edades2 obj2){

        int [] edades1 = obj1.getEdades1(), edades2= obj2.getEdades2();
        int myr1 = edades1 [0],mnr1 = edades1[0];
        int myr2 = edades2 [0],mnr2 = edades2[0];

        for(int i=0; i<edades1.length;i++){
            if(edades1[i]>myr1){
                myr1=edades1[i];
            }
            if(edades1[i]<mnr1){
                mnr1=edades1[i];
            }
        }

        for(int i=0; i<edades2.length;i++){
            if(edades2[i]>myr2){
                myr2=edades2[i];
            }
            if(edades2[i]<mnr2){
                mnr2=edades2[i];
            }
        }


        for(int i=0;i<edades1.length;i++){
            if(edades1[i]==mnr1){
                edades1[i]=mnr2;
            }
            if(edades1[i]==myr1){
                edades1[i]=myr2;
            }
        }
        obj1.setEdades1(edades1);

        for(int i=0;i<edades2.length;i++){
            if(edades2[i]==mnr2){
                edades2[i]=mnr1;
            }
            if(edades2[i]==myr2){
                edades2[i]=myr1;
            }
        }
        obj2.setEdades2(edades2);

    }

}
