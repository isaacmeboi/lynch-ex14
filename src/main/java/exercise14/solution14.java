package exercise14;


import java.util.Scanner;

class Taxes {
    double amount;
    double tax;
    String state;

    public void scn() {

        System.out.print("What is the order amount? ");
        Scanner sc = new Scanner(System.in);
        this.amount = sc.nextDouble();
        System.out.print("What is the state? ");
        this.state = sc.next();
    }

    public void prt() {
        if(state.equalsIgnoreCase("WI")) {
            System.out.printf("The subtotal is $%.2f%n", amount);
            tax = 5.5/10;
            System.out.printf("The tax is $%.2f%n", tax);
        }
        else {
            tax = 0;
        }
        double total = amount + tax;
        System.out.printf("The total is $%.2f", total);

        }
}
public class solution14 {
    public static void main(String[] args) {
        Taxes ca = new Taxes();
        ca.scn();
        ca.prt();

    }
}
/*
first things first, we import the scanner function once again. after that a class named taxes
holds the initialization of the doubles for order amount and tax as well as the string for
which state. after that there are two public voids declared, scn and prt. scn scans in the
user's inputs and stores them so that prt can print out the statement. inside of prt there
is also an if else statement to determine whether or not Wisconsin is the state being tested.
the qualsIgnoreCase function call inside of the if ensure that whether it be "wi" or "WI"
the Wisconsin tax is still calculated. if the state is WI, then the tax is zero. finally,
the main function calls scn and prt and runs the program.
 */