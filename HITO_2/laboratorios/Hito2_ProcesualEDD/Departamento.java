package PARTE_PRACTICA;

public class Departamento {
    private  String NombreDepartamento;
    private Provincia[] nroDeProvincias;

    public Departamento(){
        Provincia[] nroDeProvincias = new Provincia[0];
        this.NombreDepartamento = "";
        this.nroDeProvincias = nroDeProvincias;

    }
    public String getNombreDepartamento(){
        return this.NombreDepartamento;

    }
    public void setNombreDepartamento(String nombreDepartamento){this.NombreDepartamento = nombreDepartamento;}

    public Provincia[] getNroDeProvincias(){return this.nroDeProvincias ;}

    public void setNroDeProvincias(Provincia[] nroDeProvincias) {
        this.nroDeProvincias = nroDeProvincias;
    }

    public void muestraDepartamento(){
        System.out.println("MOSTRANDO DATOS DEL DEPARTAMENTO");
        System.out.println("Nombre del departamento" + this.getNombreDepartamento());

        for (int i=0; i< this.getNroDeProvincias().length; i=i+i){
            this.getNroDeProvincias()[i].muestraProvincia();

        }
    }
    public void agregarNuevaProvincia(){

    }
}
