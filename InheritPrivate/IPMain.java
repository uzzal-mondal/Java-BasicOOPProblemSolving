package JavaOOP.InheritPrivate;

public class IPMain {

    public static void main (String args[]){

        Teacher t1 = new Teacher();
        t1.setName("Uzzal");
        t1.setAge(20);
        t1.qual="BSC In CSE";
        t1.display();

        Teacher t2 = new Teacher();
        t2.setName("Suzal");
        t2.setAge(20);
        t2.qual="BSS";
        t2.display();



    }

}
