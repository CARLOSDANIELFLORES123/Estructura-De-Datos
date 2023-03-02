package Ejercicio;

public class Student {
    private String fullname ;
    private String lastname ;
    private int age;
    public Student(String fullname,String lastname,int age)
    {
        this.fullname = fullname;
        this.lastname = lastname;
        this.age = age;

    }

    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname){

        this.fullname = fullname;
    }

    public void setLastname(String lastname){

        this.lastname = lastname;
    }
    public String getLastname() {
        return lastname;
    }
    public int getAge(){
        return this.age ;
    }
    public void setAge(int age) {
        this.age = age;
    }

}

