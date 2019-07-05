package JavaOOP;

public class Recursive {

    // create a base case.
    int fact(int n){

        if (n==1){
            return 1;
        }else{

           return n*fact(n-1);
        }
    }





}
