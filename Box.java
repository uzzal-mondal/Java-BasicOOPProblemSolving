package JavaOOP;

public class Box {

    // instance variable.
    double height;
    double width;
    double depth;

     //create a constructer.
    Box(double h, double w, double de){

        height = h;
        width = w;
        depth = de;
    }

    void displayVol(){


        double vol = width*height*depth;

        System.out.println("Box volume "+vol);

    }
}
