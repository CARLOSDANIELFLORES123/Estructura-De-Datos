package PARTE_PRACTICA;

import java.util.Scanner;

public class Main2 {
    private static Object Provincias;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombreProvincia;
        String nombreDepartamento = null;
        String nombrePais;
        nombrePais = null;
        int numeroProvincias = 2;
        int numeroDepartamentos = 3;
        int numeroPaises = 1;
        Pais paises[] = new Pais[numeroPaises];


        for (int k = 0; k < numeroPaises; k = k + 1) {
            System.out.println("\nINGRESE DATOS DEL PAIS");
            System.out.print("Ingrese el nombre del Pais: ");
            nombrePais = leer.next();
            System.out.print("Ingrese el numero de Departamentos del Pais: ");
            numeroDepartamentos = leer.nextInt();

            Departamento departamento[] = new Departamento[numeroDepartamentos];
            System.out.println("\nINGRESE DATOS DE LOS DEPARTAMENTOS DEL PAIS " + nombrePais);

            int j;
            for (j = 0; j < numeroDepartamentos; j = j + 1) {
                System.out.print("Ingrese el nombre del Departamento" + (j + 1) + ":");
                nombreDepartamento = leer.next();
                System.out.print("Ingrese el numero de Provincias Del departamento" + (j + 1) + ": ");
                numeroProvincias = leer.nextInt();


                Provincia provincias[] = new Provincia[numeroProvincias];
                System.out.println("\nINGRESE DATOS DE LAS PROVINCIAS DEL DEPARTAMENTO" + nombreDepartamento);


            }
            for (int i = 0; i < numeroProvincias; i = i + 1) {
                System.out.print("ingrese el nombre de la Provincia " + (i + 1) + ": ");
                nombreProvincia = leer.next();

                Provincia pro = new Provincia();
                pro.setNombre(nombreProvincia);
                Object[] Provincia = new Object[0];
                Provincia[i] = Provincias;


            }
            System.out.println("");
            Departamento dep = new Departamento();
            dep.setNombreDepartamento(nombreDepartamento);
            Provincia[] nroProvincias = new Provincia[0];
            dep.setNroDeProvincias(nroProvincias);
            dep.getClass();
            departamento[j] = dep;


        }
        Pais p = new Pais();
        p.setNombrePais(nombrePais);
        p.setNroDepartamentos(numeroDepartamentos);
        Object Departamento;
        Departamento = null;
        p.getDepartamentos();
        p.muestraPais();
        int k;
        k = 0;
        paises[k] = p;
    }
}
