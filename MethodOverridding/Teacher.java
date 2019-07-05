package JavaOOP.MethodOverridding;

public class Teacher extends Person {

    String qualification;


@Override
    void  displayInfo(){

        System.out.println("Name : "+getName());
        System.out.println("Age : "+getAge());
        System.out.println("Qualification : "+qualification);
        System.out.println();
    }
}
