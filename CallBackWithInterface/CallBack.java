package OOPBest.CallBackWithInterface;

import javax.naming.Context;

public class CallBack implements CallerInterface {

    public static void main(String args[]){


        WorkingClass wc = new WorkingClass();
        wc.dataPass();

    }

    @Override
    public void dataSend(String data) {



        System.out.println("Call back data Run");
    }
}
