package JavaOOP.HashMap;

import java.util.HashMap;

public class HashmapMain {

    public static void main(String args[]){

        //key er under a amader akta value thakbe..
        HashMap<Integer,String> person = new HashMap<Integer, String>();

        person.put(100,"Uzzal");
        person.put(200,"Suzal");
        person.put(300,"Sunita");
        person.put(400,"Tuni");

        System.out.println(person.get(100));
        System.out.println(person.get(200));
        System.out.println(person.get(300));

    }
}
