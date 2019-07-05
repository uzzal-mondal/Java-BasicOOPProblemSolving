package JavaOOP;

public class MainTeach {

    public static void main(String args[]){

        ReturningValuefromMethod rt = new ReturningValuefromMethod();
        rt.square(5);
        System.out.println("Res "+rt.square(7));


        ReturningValuefromMethod rt1 = new ReturningValuefromMethod();
        rt.square(5);
        System.out.println("Res "+rt1.square(10));
    }
}
