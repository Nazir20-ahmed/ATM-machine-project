import java.util.*;

class ATM{
    float Balance;
    int pin=6284;

    public void checkpin(){
        System.out.println("Enter your four digit pin");
        Scanner sc = new Scanner (System.in); 

        int enteredpin=sc.nextInt();
        if(enteredpin==pin){
            manu();
        }
        else{
            System.out.println("Sorry enter a valid pin; ");
        }
    }
}