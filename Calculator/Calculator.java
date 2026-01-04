import java.util.Scanner;

public class Calculator{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=input.nextInt();
        System.out.println("Enter Second number");
        int num2=input.nextInt();
        System.out.println("Enter character");
        char character=input.next().charAt(0);
        switch (character){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
        }

        input.close();

    }
}