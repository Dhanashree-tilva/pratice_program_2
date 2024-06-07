
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        // Example numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 number:");
        int a = sc.nextInt();
        System.out.println("Enter 2 number:");
        int b = sc.nextInt();
        System.out.println("Enter 3 number:");
        int c = sc.nextInt();

        // Find the largest number using the ternary operator
        int largest = (a > b) 
                      ? (a > c ? a : c) 
                      : (b > c ? b : c);

        // Print the largest number
        System.out.println("The largest number is: " + largest);
    }
}
