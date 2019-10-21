import java.util.Scanner;

public class MyFirstJava {
    public static void main(String args[]) {
        int firstNo, secondNo, sum;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to my world!");
        System.out.println("My name is Sue.");


        System.out.println("What is your name?");
        String userResponse = keyboard.nextLine();
        System.out.println("Your name is" + userResponse);



        System.out.println("Enter your first number:");
        firstNo = keyboard.nextInt();

        System.out.println("Enter your second number:");
        secondNo = keyboard.nextInt();
        sum = firstNo + secondNo;
        System.out.println("Sum of " + firstNo + " and " +
                           secondNo + " is " + sum);
    }
}
