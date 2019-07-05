package JavaLearning;

import java.util.Scanner;

public class AddingInput {

    public static void main(String[]args){

        System.out.println("Enter your data");
        Scanner sc = new Scanner(System.in);



        int i=1, sum=0, n =5;

        while (i<n){

            int x = sc.nextInt();

            sum = sum+x;

            i++;
        }

        System.out.println(sum);
    }
}
