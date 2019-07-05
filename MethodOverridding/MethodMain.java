package JavaOOP.MethodOverridding;

public class MethodMain {

    public static void main(String args[]){

        Teacher t1 = new Teacher();
        t1.setName("uzzal");
        t1.setAge(20);
        t1.qualification="BSC In CSE";
        t1.displayInfo();


        Teacher t2 = new Teacher();
        t2.setName("Suzal");
        t2.setAge(22);
        t2.qualification="BSS";
        t2.displayInfo();




    }
}
