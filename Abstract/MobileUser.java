package JavaOOP.Abstract;

public abstract class MobileUser {

    // non abstract method.()
    void callMehtod(){
        System.out.println("Call method call");
    }

    //declare abstrac mehtod , just a signature.
    abstract void sendMessage();
}
