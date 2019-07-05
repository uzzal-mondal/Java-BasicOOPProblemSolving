package JavaLearning;

public class BitwiseOperator {

    public static void main(String args[]){



        int a = 32;
        int b = 12;

        int c;

        c = a&b;
        System.out.println("Person & b operator "+c);


        c = a|b;
        System.out.println("Person | B operator "+c);

        c = a^b;
        System.out.println("Person ^ B operator: "+c);


        c = a>>b;
        System.out.println("Person>> RightShift operator:- "+c);


        c = a<<b;
        System.out.println("Person<< leftshift operator:- "+c);


    }
}
