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
    public void manu(){

        System.out.println(" Enetr your choice ");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");
    }
}