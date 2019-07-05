package JavaOOP.AbastractShape;

public abstract  class Shape {


    // rectangle , triangle, circle access.
    double dim1, dim2;

    //some feature adding to other's class...
    Shape(double dim1, double dim2){

        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    // declare to abstract method.()

    abstract void area();



}
