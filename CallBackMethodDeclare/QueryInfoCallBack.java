package OOPBest.CallBackMethodDeclare;

public class QueryInfoCallBack {

    CallInterface callInterface;


    QueryInfoCallBack(CallInterface callInterface){

        this.callInterface = callInterface;

    }

    public void onResult(){

        callInterface.onEdit();
        callInterface.onUpdate();
        callInterface.onDelete();
        callInterface.onInsert();
    }


}
