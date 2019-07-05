package JavaLearning;

public class LCM {

    public static void main(String args[]) {

        int n1 = 10;
        int n2 = 4;
        int lcm= 0;

        if(n1>n2){

            lcm = n1;
        }else{

            lcm = n2;
        }


      while (true){

          if (lcm%n1==0 && lcm%2==0){

              System.out.println("The Lcm of "+n1+"and "+n2+"is "+lcm);
              break;

          }

          lcm++;
      }





    }
}
