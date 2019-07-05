package JavaLearning;

import java.util.Scanner;

public class AreaOfTriangle {

    public static final double pi = 3.14159;

    public static void main (String args[]){


       double r, area;

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter radius data");
       r = sc.nextDouble();


       area  = r*r*pi;

       System.out.println("Shape of circle : "+area);


    }
}
