package Ejercisios;

import java.io.PrintStream;
import java.net.StandardSocketOptions;

import Ejercisios.Ejercisio;
import Ejercisios.Math_utils;
import Ejercisios.Student;

public class Main {
    public static void main(String[] args) {
/*
        Ejercisio eje1 = new Ejercisio();
        eje1.mostrarMensaje();
        eje1.generarNumerosNaturales();
        eje1.generarNumerosPares();
        eje1.generarNumerosNaturalesWhile();
*/
        // Math_utils lab1 = new Math_utils("HP","0.1v",2022 );
        //lab1.printAPP();
       // lab1.generarExtencionFromCI("15465");
        //lab1.generarNumeroParNatural(10 );
        //lab1.generarNumeroNatural(21);
/*
         /*
        System.out.println("HOLA MUNDO");
        for(int i = 1; i<11;i++){
            System.out.println("-"+ i);
        }
        for(int i = 2; i<11; i = i+2){
            System.out.println("-"+i);
        }
        int i=0;
        while(i<=5){
            System.out.println(i);
            i++;
        }

        int i=2;
        while(i<=10){
            System.out.println(i);
            i=i+2;
        }
*/
        Student k = new Student("pepito", "pep",25 );
// mostrando nombre completo y cambiando nombre
        // k.getFullName();
        String nombre = k.getFullName();
        System.out.println(nombre);

        k.setFullName("pepito1");
        String Cambionombre = k.getFullName();
        System.out.println(Cambionombre);

// mostrando apellido y cambiando apellido
        // k.getLastName();
        String Apellido = k.getLastName();
        System.out.println(Apellido);

        k.setLastName("pep1");
        String CambioApellido = k.getLastName();
        System.out.println(CambioApellido);
        // mostrando año y  cambiando año
        //  k.getAge();
        int año = k.getAge();
        System.out.println(año);

        k.setAge(30);
        int CambioAño = k.getAge();
        System.out.println(CambioAño);
    }


}

