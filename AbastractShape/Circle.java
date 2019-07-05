package JavaOOP.AbastractShape;

public class Circle extends Shape {

    Circle(double r){

        super(r, r);

    }


    @Override
    void area(){

        double cir = (Math.PI*dim1*dim2);
        System.out.println("Area of circle : "+cir);

    }
}
