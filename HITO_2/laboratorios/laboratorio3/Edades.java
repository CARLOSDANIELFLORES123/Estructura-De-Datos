package pilas;

import java.net.StandardSocketOptions;
import java.security.PrivateKey;

public class Edades {

    private String universidad;
    private String paralelo;
    private  int[] edades;

    public String getUniversidad(){
        return universidad;
    }
    public String getParalelo(){
        return paralelo;
    }
    public int[] getEdades(){
        return  edades;
    }

    public Edades (String universidad, String paralelo, int[] edades){
        this.universidad = universidad;
        this.paralelo = paralelo;
        this.edades = edades;
    }
    public void setUniversidad (String universidad){
        this.universidad = universidad;
    }
    public void setParalelo(String paralelo){
        this.edades = edades;
    }
    public  void setEdades(int [] edades){
        this.edades=edades;
    }

    public void mostrar(){
        System.out.println("mostrando valores");
        System.out.println("Universidad: "+ this.getUniversidad());
        System.out.println("Paralelo: "+this.getParalelo());

        for(int i=0; i<this.getEdades().length;i++){

            System.out.println("Edades: "+this.getEdades()[i]+",");

        }
        System.out.println();

    }





}
