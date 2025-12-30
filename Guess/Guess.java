import java.util.Scanner;
import java.util.Random;

public class Guess{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random rnd=new Random();
        int ori=rnd.nextInt(50)+1;
        System.out.println("Choose a number 1 till 50");
        for (int i=0;i<5;i++){
            int num=input.nextInt();
            if (num!=ori){
                System.out.println("Try again");
            }
        }

        System.out.println("THe number is "+ori);
        



        input.close();
    }
}