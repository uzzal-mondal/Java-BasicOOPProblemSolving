package JavaOOP;

public class Student {

  //static method

   static int a ;
   static String name ;

 // static member initilize to static block;
   static {

       a = 10;
       name = "uzzal";

   }


  static void showRes(){

       a  = 10;
       System.out.println("Static method");
   }

   static void display(){

       System.out.println(a);
       System.out.println(name);
   }


}
