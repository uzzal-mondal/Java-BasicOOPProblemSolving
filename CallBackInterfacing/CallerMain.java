package OOPBest.CallBackInterfacing;

import OOPBest.CallBackWithInterface.CallerInterface;

public class CallerMain  {

    public static void main(String args[]){

        Caller call = new Caller();
        call.callerInfo(new CallBackingInterfacing() {
            @Override
            public void CallInterfacingf(String data) {

                System.out.println("The data is valuable : "+data);


            }
        });


    }


}
