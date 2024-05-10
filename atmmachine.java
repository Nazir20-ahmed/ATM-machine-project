import java.util.*;

class ATM{
    float Balance;
    
    int pin=6284; // here set the ATM pin 


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
                        // Here we  add a manu method any where we can change our choice;
    public void manu(){

        System.out.println(" Enetr your choice ");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");
    
    Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt(); // now we add here our some basic choices for ATM requirements 
       
        if(opt==1){
            checkBalance();
        }

        else if(opt==2){
            Withdramoney();
        }
        else if(opt==3){
            depositmoney();
        }
        else if(opt==4){
            return;
        }
        else{
            System.out.println("Enter a valid choice:");
        }
    }
                // put all the choices in form of method any where we can call these methods 

        public void checkBalance(){
            System.out.println("Balance:"+Balance);
            manu();
        }
    
        public void Withdramoney(){
            System.out.println("Enter amount to withdraw money");
            Scanner sc=new Scanner (System.in);
            float amount= sc.nextFloat();
            if(amount>Balance){
                System.out.println("Insuficient balance");
            }
            else{
                Balance=Balance-amount;
                System.out.println("Withdraw successfuly");
            }
            manu();
        }
        public void depositmoney(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter amount to deposit");
            float amount= sc.nextFloat();
            Balance=Balance+amount;
            System.out.println("Deposit succssefully");
            manu();
    
        }
    }
    public class atmmachine {
        public static void main(String[] args) {

            // Calling here all the methods in main method..
       
        ATM obj = new ATM();
            obj.checkpin();
            obj.checkBalance();
            obj.Withdramoney();
            obj.depositmoney(); 
            
        }
        
    }
    
    
    


    
