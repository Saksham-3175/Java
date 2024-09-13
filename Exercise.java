/*
Enter s1
Enter s2
Enter s3
Enter s4
Enter s5
Total marks obtained form all subjects:
Total marks of all subjects:500
percentage: obtained/all * 100
 */
import java.util.Scanner;
public class Exercise{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        float marksObtained = 0;
        float S1, S2, S3, S4, S5;
        float totalMarks = 500;
        float percentage;

        System.out.println("Enter marks for Mathematics: ");
        S1 = scan.nextFloat();
        marksObtained = S1 + marksObtained;

        System.out.println("Enter marks for Physics: ");
        S2 = scan.nextFloat();
        marksObtained = S2 + marksObtained;

        System.out.println("Enter marks for Chemistry: ");
        S3 = scan.nextFloat();
        marksObtained = S3 + marksObtained;

        System.out.println("Enter marks for Biology: ");
        S4 = scan.nextFloat();
        marksObtained = S4 + marksObtained;

        System.out.println("Enter marks fo English:");
        S5 = scan.nextFloat();
        marksObtained = S5 + marksObtained;

        System.out.println("Total marks obtained: " + marksObtained);


        percentage = (marksObtained / totalMarks) * 100;

        System.out.println("You scored " + percentage + " percentage.");



    }

}