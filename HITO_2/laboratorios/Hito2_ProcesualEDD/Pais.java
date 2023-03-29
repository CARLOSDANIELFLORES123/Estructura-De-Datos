package PARTE_PRACTICA;

public class Pais {
    private String NombrePais;

    private int nroDepartamentos;

    private Departamento [] departamentos;

    public Pais (){
        Departamento[] departamentos = new Departamento[0];
        this.NombrePais = "";
        this.nroDepartamentos = 0;
        this.departamentos = departamentos;

    }
    public String getNombrePais(){
        return this.NombrePais;
    }
    public void setNombrePais(String nombrePais){
        this.NombrePais = nombrePais;

    }
    public int getNroDepartamentos(){
        return this.nroDepartamentos;

    }
    public void setNroDepartamentos(int nroDepartamentos){
        this.nroDepartamentos = nroDepartamentos;

    }

    public Departamento[] getDepartamentos() {
        return this.departamentos;
    }
    public void muestraPais(){
        System.out.println("MOSTRANDO DATOS DEL PAIS");
        System.out.println();

    }
}
