package Atm;
import java.util.Scanner;

public class Atm {
    static int balance=0;
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("What operation do you want to perform");
        System.out.println("1. Balance check");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("Enter a number.");

        int choice= input.nextInt();
        
        if (choice==1){
            balancecheck();
        }
        else if (choice == 2){
            System.out.println("Enter amount to be withdrawn");
            int a=input.nextInt();
            withdraw(a);
        }

        else if(choice==3){
            System.out.println("Enter amount to be deposited");
            int a =input.nextInt();
            deposit(a);
        }

        input.close();

        
    }

    static void balancecheck() {
        Scanner input= new Scanner((System.in));
        if (balance == 0) {
            System.out.println(balance);
            System.out.println("Enter amount");
            int add=input.nextInt();
            balance+=add;
        }
        System.out.println(balance);
        input.close();
    }

    static void withdraw(int amount){
        System.out.println("Present amount: "+balance);
        if (amount> balance){
            System.out.println("error: insufficient funds");
        }
        else{
        balance-=amount;
        System.out.println("Remaining balance: "+balance);
    }
    }

    static void deposit(int amount){
        System.out.println("Present balance: "+balance);
        balance+=amount;
        System.out.println("Updated Balance: "+balance);
    }

    

    
    
}
