import java.util.Scanner;

public class EBBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int units;
        double bill;
        int choice;

        System.out.println("1. Domestic");
        System.out.println("2. Commercial");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        System.out.print("Enter units consumed: ");
        units = sc.nextInt();

        if (choice == 1) {
            bill = units * 5;
            System.out.println("Domestic Bill = Rs." + bill);
        } else if (choice == 2) {
            bill = units * 8;
            System.out.println("Commercial Bill = Rs." + bill);
        } else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}