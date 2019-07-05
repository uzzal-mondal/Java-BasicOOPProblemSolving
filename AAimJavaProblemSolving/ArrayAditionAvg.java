package JavaLearning;

import java.util.Scanner;

public class ArrayAditionAvg {

    public static void main(String args []) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter data:-");
        double num[] = new double[5];

        for (int i =0; i<num.length; i++){
            num[i]=sc.nextDouble();

        }



        double sum = 0;

       for (int i=0; i<num.length; i++){

           sum = sum+ num[i];

       }

       System.out.println("Num of sum "+sum);


        double avg = sum/num.length;
        System.out.println("Num of average : "+avg);




    }


}
