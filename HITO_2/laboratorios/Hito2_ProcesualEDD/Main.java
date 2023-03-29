package PARTE_PRACTICA;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        String NombreDepartamento, Nombre;
        int nprovincias = 2;

        System.out.print("Ingrese nombre del departamento: ");
        NombreDepartamento = leer.next();
        Provincia nroDeProvincias[] = new Provincia[nprovincias];
        System.out.print("INGRESE DATOS DE LA PROVINCIA: ");
        for (int i=0 ; i< nprovincias; i++){
            System.out.print("Ingrese nombre de la provincia: "+(i+1)+" :");
            Nombre = leer.next();

            Provincia pro = new Provincia();
            pro.setNombre(Nombre);
            nroDeProvincias[i]= pro;
        }
        Departamento Dep = new Departamento();
        Dep.setNombreDepartamento(NombreDepartamento);
        Dep.setNroDeProvincias(nroDeProvincias);
        Dep.muestraDepartamento();
    }
}
