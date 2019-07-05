package JavaLearning;

public class LcmAndGcm {

    public static void main(String args[]){


        int fNum = 60;
        int sNum = 24;

        int gcm, lcm, rem;

        int n1= 60, n2 = 24;

        while (n2!=0){

          rem = n1%n2;
          n1 = n2;
          n2 = rem;



        }

        gcm = n1;
        System.out.println("Gcm = "+gcm);

        lcm = (n1*n2)/gcm;

        System.out.println("Lcm : "+lcm);


    }
}
