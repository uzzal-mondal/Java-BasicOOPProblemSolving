package JavaLearning;

public class logicalAnd    {

    public static void main(String args[]){

        int num1 = 10, num2 = 20, num3 = 30;
        boolean result;

        result = ((num1!=num2) && (num2!=num1) && (num3>num2));

        System.out.println(result);

        result = ((num1!=num2) && (num2!=num1) && (num3==num2));

            System.out.println(result);

    }
}
