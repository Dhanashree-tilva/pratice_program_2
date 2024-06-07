import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Accept three integers from the user
        System.out.print("Enter the first integer: ");
        int a = sc.nextInt();
        
        System.out.print("Enter the second integer: ");
        int b = sc.nextInt();
        
        System.out.print("Enter the third integer: ");
        int c = sc.nextInt();
        
        // Use conditional statements to sort the numbers
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        
        // Display the numbers in ascending order
        System.out.println("The numbers in ascending order are: " + a + ", " + b + ", " + c);
        
    }
}
