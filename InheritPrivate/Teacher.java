package JavaOOP.InheritPrivate;

public class Teacher extends Person {

    // name age;

    String qual;


    void display(){

        System.out.println("Name "+getName());
        System.out.println("Age "+getAge());
        System.out.println("qualification "+qual);
        System.out.println();
    }

}
