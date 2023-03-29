package PARTE_PRACTICA;

public class Provincia {

    private String Nombre;

    public Provincia(){
        this.Nombre = "";
    }
    public String getNombre(){
        return this.Nombre;

    }
    public void setNombre(String nombre){
        this.Nombre = nombre;
    }
    public void muestraProvincia(){
        System.out.println("\nMOSTRANDO DATOS DE LA PROVINCIA");
        System.out.println("Nombre de la provincia"+ this.getNombre());

    }
}
