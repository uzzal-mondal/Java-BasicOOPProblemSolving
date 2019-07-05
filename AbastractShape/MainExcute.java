package JavaOOP.AbastractShape;

public class MainExcute {

    public static void main(String args[]){

        // we are don't create obj , just create a reference
        Shape re = new Rectangle(10,20);
        re.area();

        Shape tri  = new Triangle(10,20);
        tri.area();

        Shape cir = new Circle(10);
        cir.area();



    }
}
