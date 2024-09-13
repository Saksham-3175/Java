
import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name(only first name) and age:");
        String name = scan.next();

        int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("You are getting a License");
                       } 
        else {
            System.out.println("Be an adult first.");
             }
    }
}
