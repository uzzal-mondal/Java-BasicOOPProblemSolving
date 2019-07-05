package JavaOOP;

public class CallByValueTest {

    public static void main(String args[]){


       callByValue ob = new callByValue();
       ob.name = "suzal";
        System.out.println("before call : "+ob.name);

        ob.change(ob);
        System.out.println("after calling : "+ob.name);


    }
}
