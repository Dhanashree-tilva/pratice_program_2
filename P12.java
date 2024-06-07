import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept two integers from the user
        System.out.print("Enter the first integer: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = sc.nextInt();

        // Calculate the last digits
        int lastDigitFirstNumber = firstNumber % 10;
        int lastDigitSecondNumber = secondNumber % 10;

        // Calculate the sum of the last digits
        int sumOfLastDigits = lastDigitFirstNumber + lastDigitSecondNumber;

        // Display the result
        System.out.println("The sum of the last digits is: " + sumOfLastDigits);
    }
}
