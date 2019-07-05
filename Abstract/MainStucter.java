package JavaOOP.Abstract;

public class MainStucter {

    public static void main(String args[]){


        // create a sub class reference
        // go to abstract method call.
        MobileUser mb;
        mb = new Rahim();
        mb.callMehtod();
        mb.sendMessage();


        mb = new Karim();
        mb.sendMessage();
    }
}
