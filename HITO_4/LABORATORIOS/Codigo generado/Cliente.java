package ColaDeClientes;

public class Cliente {
    private String nombres;
    private String apellidos;
    private int edad;
    private String Pais;
    private String genero;
    private String Tipo;

    public Cliente(String nombres , String apellidos , int edad , String Pais , String genero , String Tipo){

        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.Pais= Pais;
        this.genero = genero;
        this.Tipo = Tipo;

    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getPais() {
        return Pais;
    }

    public String getGenero() {
        return genero;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public void muestraCliente(){

        System.out.println( " \n MOSTRANDO AL CLIENTE ");
        System.out.println( " nombres : " + this.getNombres());
        System.out.println( " apellidos : " + this.getApellidos());
        System.out.println( " edad : " + this.getEdad());
        System.out.println( " Pais : " + this.getPais());
        System.out.println( " Genero : " + this.getGenero());
        System.out.println( " Tipo : " + this.getTipo());
    }

}
