import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of units consumed
        System.out.print("Enter the number of units consumed: ");
        int units = sc.nextInt();

        double billAmount = 0;

        // Calculate bill amount based on unit consumption
        if (units <= 200) {
            billAmount = units * 0.80;
        } else if (units <= 300) {
            billAmount = (200 * 0.80) + ((units - 200) * 0.90);
        } else {
            billAmount = (200 * 0.80) + (100 * 0.90) + ((units - 300) * 1.00);
        }

        // Add the minimum meter charge
        billAmount += 100;

        // If the total amount is more than Rs. 300, add additional surcharge
        if (billAmount > 300) {
            billAmount += billAmount * 0.1236;
        }

        // Print the final bill amount
        System.out.println("The total bill amount is: Rs. " + billAmount);

    }
}
