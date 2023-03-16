package Ejercisios;

public class Student {

    private String fullname;
    private String lastname;
    private int age;
    public Student(String fullname, String lastname, int age){
        this.fullname = fullname;
        this.lastname = lastname;
        this. age = age;
    }
    //get retorna algo
    public String getFullName(){


        return this.fullname;
        //System.out.println(this.fullname + "-" + this.lastname );
    }
    // set cambia un valor
    public void setFullName(String fullname){

        this.fullname = fullname;

        //System.out.println(this.lastname );


    }

    public void setLastName(String lastname){

        this.lastname = lastname;

        //System.out.println(this.lastname );

    }
    public String getLastName(){

        return this.lastname;

        //System.out.println(this.lastname );

    }
    public void setAge(int age){

        this.age = age;

        //System.out.println(this.lastname );

    }
    public int getAge(){

        return this.age;

        //System.out.println(this.lastname );

    }
}