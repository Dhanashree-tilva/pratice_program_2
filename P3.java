import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int r = 0;
        int temp = n;

        // Reverse the number
        while (temp != 0) {
            int digit = temp % 10;
            r = r * 10 + digit;
            temp /= 10;
        }

        // Check if the original number is equal to the reversed number
        if (n == r) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }

    }
}
