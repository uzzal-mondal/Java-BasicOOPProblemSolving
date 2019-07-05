package JavaOOP.LinkListDemo;

import java.util.LinkedList;

public class StMain {

    public static void main(String args[]) {


        LinkedList<Student> list = new LinkedList<Student>();

        Student st1 = new Student("uzzal", "CSE", 20);
        Student st2 = new Student("suzal", "CSE", 20);
        Student st3 = new Student("dipu", "CSE", 20);
        Student st4 = new Student("Ritu", "CSE", 20);
        Student st5 = new Student("purnima", "CSE", 20);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        for (Student s : list){

            System.out.println(s.name+" "+s.depname+" "+s.age);
        }


    }

}
