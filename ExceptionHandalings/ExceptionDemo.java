package JavaOOP.ExceptionHandalings;

import java.text.DecimalFormat;

public class ExceptionDemo {

    public static void main(String args[]){

        DecimalFormat dc = new DecimalFormat("0.00");

        double x = 2.9854126;
        System.out.println("X = "+dc.format(x));
    }
}
