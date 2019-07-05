package JavaLearning;

import java.util.Scanner;

public class EvenOddin10 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num ");

        int count = 0;
        int i = 0;

        int even_count = 0;
        int odd_count = 0;

        while (i<5){

            int x = sc.nextInt();

            if (x%2 == 0){

                even_count=even_count+1;
                System.out.println("Even num"+i);
            }else {
                odd_count++;
                System.out.println("Odd num "+i);
            }


            i++;
        }

        System.out.println(" ");

        System.out.println("Total Even "+even_count);
        System.out.println("Total Odd "+odd_count);

    }
}
