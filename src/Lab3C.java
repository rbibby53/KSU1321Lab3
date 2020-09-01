import java.util.Scanner;
import static java.lang.System.*;

class Lab3C {
    public static void main(String[] args) {
        //setup scanner
        Scanner input = new Scanner(in);

        //ask user how much of each they have
        out.print("Enter the number of quarters: ");
        int q = input.nextInt();
        out.print("Enter the number of dimes: ");
        int d = input.nextInt();
        out.print("Enter the number of nickels: ");
        int n = input.nextInt();
        out.print("Enter the number of pennies: ");
        int p = input.nextInt();

        //print how many of each they have
        out.println("You entered "+ q + " quarters.");
        out.println("You entered "+ d + " dimes.");
        out.println("You entered "+ n + " nickels.");
        out.println("You entered "+ p + " pennies.");

        //math
        float toatal = (float) ((q*0.25) + (d*0.1) + (n*0.05) + (p*0.01));
        int floor = (int) Math.floor(toatal);
        float cents = (toatal-floor)*100;
        int round = Math.round(cents);


        //print final line
        out.println("Your total is " + floor + " dollars and " + round + " cents.");
    }
}