import java.util.Scanner;
import static java.lang.System.*;

class Lab3B {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);

        out.print("Course 1 hours: ");
        float c1h = input.nextFloat();
        out.print("Grade for course 1: ");
        float c1g = input.nextFloat();

        out.print("Course 2 hours: ");
        float c2h = input.nextFloat();
        out.print("Grade for course 2: ");
        float c2g = input.nextFloat();

        out.print("Course 3 hours: ");
        float c3h = input.nextFloat();
        out.print("Grade for course 3: ");
        float c3g = input.nextFloat();

        out.print("Course 4 hours: ");
        float c4h = input.nextFloat();
        out.print("Grade for course 4: ");
        float c4g = input.nextFloat();

        float hours = (c1h+c2h+c3h+c4h);
        float qhours = (c1g*c1h)+(c2g*c2h)+(c3g*c3h)+(c4g*c4h);
        float gpa = (qhours/hours);
        out.println("Total hours is: " + hours);
        out.println("Total quality points is: " + qhours);
        out.println("Your GPA for this semester is " + gpa);

    }
}