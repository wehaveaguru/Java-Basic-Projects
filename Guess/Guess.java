import java.util.Scanner;
import java.util.Random;

public class Guess{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random rnd=new Random();
       
        int ori=rnd.nextInt(50)+1;
        for (int i=0;i<5;i++){
            System.out.println("Choose a number 1 till 50");
            int num=input.nextInt();
            if (num!=ori){
                continue;
            }
        }

        System.out.println("THe number is "+ori);
        



        input.close();
    }


}