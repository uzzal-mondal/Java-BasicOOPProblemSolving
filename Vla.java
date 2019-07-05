package JavaOOP;

public class Vla {

    //Variable length method overloading

    int sum = 0;

    void add(int...num) {

       for (int res:num){

           System.out.println(res);

           sum = sum+res;
       }

       System.out.println("sum data: "+sum);

    }

}
