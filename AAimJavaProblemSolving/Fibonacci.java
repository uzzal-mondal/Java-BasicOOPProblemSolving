package JavaLearning;

public class Fibonacci {

    public static void main(String args[]) {


        int i, j;

        for (i = 2; i <= 5; i++) {   // condition true hole vitore loop a jabe.

            System.out.println("Number start - " + i);

            for (j = 2; j < i; j++) {

                // fast 2 diye vag korbe jodi mile not prime,
                // r jodi na mile 2 er jaigai 3 diye vag korbe i er value k
                /* when j and i value soman hobe kintuo condition j<i false hobe, kintuo i
                er value 5 and j er value 5 hobe  tokon niser if condition kaj kore prime hobe */

                if (i % j == 0) {

                    break;
                }
            }


            System.out.print(i + " ");

            if (i == j) {
                System.out.println("prime num ");
            } else {
                System.out.println("Not prime num");
            }
        }

    }
}
