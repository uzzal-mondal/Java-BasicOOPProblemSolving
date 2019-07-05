package JavaOOP;

public class Teacher {


    // method overloading.
    void teachEx(String name,String address,String dept){

        System.out.println(name+" ,"+address+", "+dept);


    }


     void   teachEx(int age, int eClass){

        System.out.print("Age : "+age +" Class: "+eClass);
     }

    void   teachEx(){

        System.out.print("There are no value added");
    }



}
