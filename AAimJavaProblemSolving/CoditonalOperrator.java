package JavaLearning;

import java.util.Scanner;

public class CoditonalOperrator {

    public static void main(String args[]){

        int num1,num2,large;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number data:- ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        large = (num1>num2)? num1 : num2;

        System.out.println("Large Nume: - "+large);

    }
}
