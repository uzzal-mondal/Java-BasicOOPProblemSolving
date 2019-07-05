package JavaLearning;

import java.util.Scanner;

public class IfelseConditionCheck {

    public static void main (String args[]){

        int a, b;

        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("This is your input number: ");
       num = sc.nextInt();


        int result;

        if (num>0){

            System.out.println("Possitive num a = "+num);
        }else if(num<0){

            System.out.println("Negative num a ="+num);
        }else{

            System.out.println("This is Zero   a num excptional");
        }


    }
}
