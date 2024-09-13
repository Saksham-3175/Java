import java.util.Scanner;
public class Input{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in); //For integers
        Scanner S= new Scanner(System.in);  //For Strings

        String str = S.nextLine();

        System.out.println("Enter string:");
        System.out.println(str);


        System.out.println("Enter your name: ");
        String name = s.nextLine();
        System.out.println(name);

        System.out.println("Enter the first number: ");
        int a = s.nextInt();

        System.out.println("Enter the second number: ");
        int b = s.nextInt();

        int sum = a + b;
        System.out.println("The sum is: " + sum);

        System.out.println("Enter email ID: ");
        String email = S.next();

        boolean b1 = S.hasNext();
        System.out.println(b1);







    }
}