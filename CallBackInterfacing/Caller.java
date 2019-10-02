package OOPBest.CallBackInterfacing;

public class Caller {

    public void callerInfo(CallBackingInterfacing interfacing){

        for(int i= 0; i<5; i++){

            try {
                Thread.sleep(100);
                System.out.println(" Caller now finding for you : "+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }



        }

       interfacing.CallInterfacingf("Hei I want to calling now CallBack method.");

    }






}
