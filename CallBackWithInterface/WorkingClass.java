package OOPBest.CallBackWithInterface;

import javax.naming.Context;

public class WorkingClass {

    CallerInterface caller;
    Context context;

    public  WorkingClass(CallerInterface caller,Context context){

        this.caller = caller;
        this.context = context;
    }

    public WorkingClass() {

    }


    public void dataPass(){
        caller.dataSend(" Call Back data is send now .. ");

    }


}
