import java.util.Scanner;
import static java.lang.System.*;

class Lab3A {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);

        out.print("Amount owed: $");
        float ammountOwed = input.nextFloat();

        out.print("APR: ");
        float apr = input.nextFloat();

        float MPR = (float) apr/12;
        float min = (float) (MPR*0.01) * ammountOwed;

        out.println("Monthly percentage rate: " + MPR);
        out.println("Minimum payment: $" + min);

    }
}