package JavaOOP.SuperClass;

public class Person {


    String name;
    int age;

    Person(String  n, int a){

        name = n;
        age = a;
    }

    void display(){

        System.out.println("Name "+ name );
        System.out.println("Age "+ age );
    }

}
