package Ejercisios;

public class Math_utils {
    private String nameAPP;
    private String version;
    private int year;

    public Math_utils(String nameAPP, String version, int year) {
        this.nameAPP = nameAPP;
        this.version = version;
        this.year = year;
    }

    public void printAPP() {
        System.out.println(this.nameAPP + "-" + this.version + "-" + this.year + "-");
    }

    public void generateNaturalNumbers(int limit) {
        for(int i = 0; i<=limit; i++){
            System.out.println(i);
        }

    }

    public void generatePairNumbers(int limit) {
        for(int i = 2; i<=limit; i=i+2){
            System.out.println(i);
        }

    }

    public void getExtensionFromCI(String CI) {



        String ext= " ";
        //13644437
        //substring es despues de (8)datos mostrara lo ingresado
        ext=CI.substring(8);

        System.out.println("Extencion = "+ext);


    }
}