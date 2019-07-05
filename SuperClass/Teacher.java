package JavaOOP.SuperClass;

public class Teacher extends Person {

    String dept;

      Teacher(String n, int a, String d){

         super(n,a);
          dept = d;
      }


      @Override
    void display(){
          super.display();
          System.out.println("Department : "+dept);
          System.out.println();
    }

}
