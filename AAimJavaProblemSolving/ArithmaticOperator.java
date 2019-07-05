package JavaLearning;

import java.util.Scanner;

public class ArithmaticOperator {

    public static void main(String args[]){


        // today learn it Arithmatic operator in java

        int num1, num2, result;

        //asignment operator

        System.out.println("Enter your input: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("Enter youur next Input: ");
        num2 = sc.nextInt();

       num1+=num2;  // asignment  num1 = num1+num2;
        System.out.println("add data -"+num1);

        num1-=num2;  // asignment num1 = num1-num2;
        System.out.println("asignment sub -"+num1);

        num1*=num2 ; // num1 = num1-num2;
        System.out.println("asignment multiply -"+num1);

        num1/=num2;
        System.out.println("asignment divided -"+num1);

        num1%=num2;  // num1 = num1%num2
        System.out.println("asignment modulas -" + num1);








    }
}
