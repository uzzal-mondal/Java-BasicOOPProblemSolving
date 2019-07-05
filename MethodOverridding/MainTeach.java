package JavaOOP.MethodOverridding;

public class MainTeach {

    public static void main(String args[]){

        int count = 0;
        int avg = 0;
        int num = 100;

        for (int i = 0; i<=num; i++){
            if (i%2==0){

                System.out.println(i);
                count = count+i;
            }
        }

        System.out.println("total num : "+count);

        System.out.println("Average : "+count/num);
    }
}
