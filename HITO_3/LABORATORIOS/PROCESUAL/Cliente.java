package PilaDeClientes;

public class Cliente {
    private String nombres;
    private String apellidos;
    private int edad;
    private String direccion;
    private String genero;

    public Cliente(String nombres , String apellidos , int edad , String direccion , String genero){

        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
        this.genero = genero;

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

    public String getDireccion() {
        return direccion;
    }

    public String getGenero() {
        return genero;
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

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void muestraCliente(){

        System.out.println( " \n MOSTRANDO AL CLIENTE ");
        System.out.println( " nombres: " + this.getNombres());
        System.out.println( " apellidos: " + this.getApellidos());
        System.out.println( " edad: " + this.getEdad());
        System.out.println( " direccion: " + this.getDireccion());
        System.out.println( " genero: " + this.getGenero());
    }

}
