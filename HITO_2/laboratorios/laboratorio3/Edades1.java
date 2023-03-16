package pilas;

public class Edades1 {
    private String universidad1;
    private String paralelo1;
    private int[] edades1;

    public String getUniversidad1(){
        return universidad1;
    }
    public String getParalelo1(){
        return paralelo1;
    }
    public int[] getEdades1(){
        return edades1;
    }

    ////////////////////////////////////////////////////////////////////

    public void setEdades1(int[] edades1){
        this.edades1 = edades1;
    }
    //////////////////////////////////////////////////////////////////////
    public Edades1(String universidad1, String paralelo1, int[] edades1){
        this.universidad1=universidad1;
        this.paralelo1 = paralelo1;
        this.edades1=edades1;

    }

    ////////////////////////////////////////////////////////////////////////
    public void mostrar1 (){

        System.out.println("Mostrar Datos");
        System.out.println("Universidad: "+ this.getUniversidad1());
        System.out.println("Paralelo: "+ this.getParalelo1());

        for(int i=0; i<this.getEdades1().length;i++){

            System.out.println("Edades:"+this.getEdades1()[i]+",");
        }

    }

}