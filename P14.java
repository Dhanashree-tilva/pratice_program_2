import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        // Check if the least significant bit is 0 (even) or 1 (odd)
        String[] messages = {"The number is even.", "The number is odd."};
        System.out.println(messages[number & 1]);
        
    }
}
