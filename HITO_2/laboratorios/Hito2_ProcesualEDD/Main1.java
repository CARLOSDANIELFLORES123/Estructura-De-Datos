package PARTE_PRACTICA;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        String Nombre;

        System.out.println("Ingrese nombre de la Provincia");
        Nombre = leer.next();

        Provincia pro = new Provincia();
        pro.setNombre(Nombre);
        pro.muestraProvincia();

    }
}
