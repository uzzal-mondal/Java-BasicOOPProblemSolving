package JavaOOP.AbastractShape;

public class Rectangle extends Shape {

    // dim1, dim2 are storage

    // create to constructer to access
    Rectangle(double dim1, double dim2){

        //super class a 02 ta paramiter attach korlam.
        super(dim1, dim2);

    }

    // method overriding this call in exends abstract mehtod.
    @Override
    void area(){

        //
        double recArea = dim1*dim2;
        System.out.println("Rectangle Area : "+recArea);
    }


}
