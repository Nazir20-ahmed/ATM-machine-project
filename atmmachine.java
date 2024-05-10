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
    Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
       
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
        public void checkBalance(){
            System.out.println("Balance:"+Balance);
            manu();
        }
    

}

    
