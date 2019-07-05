package JavaLearning;

public class Fibbonacci {

    public static void main(String args[]){


      int num =5;
      int fibo = 0;
      int fNum = 0, sNum = 1;
      int i = 0;

      while (i<num){

          if (i<=1){
             fibo = i;

          }else {

            fibo =   fNum+sNum;
            fNum = sNum;
            sNum = fibo;
          }

          System.out.print("  "+fibo);
          i++;
      }



    }
}
