package JavaOOP;

import java.util.LinkedList;

public class LinkList {

    public static void main(String args[]){


        LinkedList<String> cname = new LinkedList<>();

        cname.add("Afghanstan");
        cname.add("Bangladesh");
        cname.add("Nepal");
        cname.add("India");
        cname.add(4,"Spain");
        cname.addFirst("Australia");
        cname.remove(0);

        //for each
       for (String rs : cname)

        System.out.println(rs);

       //size
       System.out.println("Zize of the link list: - "+cname.size());

    }

}
