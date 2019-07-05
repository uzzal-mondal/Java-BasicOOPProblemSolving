package JavaOOP.ThisKeyword;

public class Patient {

    String name;
    String disease;
    int age;

    //create constructer using this..
    Patient(String name, int age){

        this.name = name;
        this.age = age;

    }

    Patient(String name, int age,String disease){

        //using to this keyword same to super keyword
        this(name,age);
        this.disease = disease;

    }


    void display(){

        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Disease : "+disease);
        System.out.println();
    }
}
