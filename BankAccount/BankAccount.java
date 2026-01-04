package BankAccount;
import java.util.Random;
import java.util.Scanner;
class Create {
    Random rnd= new Random();
    private String name;
    private int accountno=rnd.nextInt(999);
    void setName(String n){
        name=n;
    }

    int getacc(){
        return accountno;
    }

    String getname(){
        return name;
    }
}

class Operation extends Create{
    private double balance;

    double checkBalance(){
        return balance;
    }

    void withdraw(double amount){
        balance-=amount;
        System.out.println("Remaining Balance: "+balance);
    }

    void deposit(double amount){
        balance+=amount;
        System.out.println("Updated balance: "+balance);
    }
}
public class BankAccount {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Create Bank account");
        Create ba= new Create();
        System.out.println("Provide the name of the holder of the account");
        String name=input.next();
        ba.setName(name);
        System.out.println("Account Holder Name: "+ba.getname());
        System.out.println("Account NUmber: " + ba.getacc() );


        System.out.println("Enter amount to be deposited");
        double bal=input.nextDouble();
        Operation b= new Operation();
        b.deposit(bal);
        System.out.println("New Balance: "+b.checkBalance());
        System.out.println("Enter amount to be withdrawn");
        double w= input.nextDouble();
        b.withdraw(w);
        System.out.println("Remaining Balance: "+b.checkBalance());
        input.close();
        
    }
}
