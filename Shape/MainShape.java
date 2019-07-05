package JavaOOP.Shape;

public class MainShape {

    public static void main (String args[]){


        // shape - 3  variable's are create....
        Shape[] sh = new Shape[3];
        sh[0] = new Shape();
        sh[1] =new Rectangle(10,20);
        sh[2] =new Triangle(10,15);


      for (int i = 0; i<sh.length; i++){

          System.out.println(sh[i].area());
      }






    }
}
