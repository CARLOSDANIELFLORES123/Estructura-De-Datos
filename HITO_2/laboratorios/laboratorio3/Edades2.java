package pilas;

public class Edades2 {
    private String universidad2;
    private String paralelo2;
    private int[] edades2;

    ///////////////////////////////////////////////////////////////////////
    public String getUniversidad2(){
        return universidad2;
    }
    public String getParalelo2(){
        return paralelo2;
    }

    public int[] getEdades2() {
        return edades2;
    }
    ////////////////////////////////////////////////////////////////////

    public void setEdades2(int[] edades2){
        this.edades2 = edades2;
    }
    //////////////////////////////////////////////////////////////////////
    public Edades2(String universidad2,String paralelo2,int[] edades2){

        this.universidad2=universidad2;
        this.paralelo2 = paralelo2;
        this.edades2=edades2;
    }


    ////////////////////////////////////////////////////////////////////////
    public void mostrar2 (){

        System.out.println("Mostrar Datos");
        System.out.println("Universidad: "+ this.getUniversidad2());
        System.out.println("Paralelo: "+ this.getParalelo2());

        for(int i=0; i<this.getEdades2().length;i++){

            System.out.println("Edades:"+this.getEdades2()[i]+",");
        }
    }
}
