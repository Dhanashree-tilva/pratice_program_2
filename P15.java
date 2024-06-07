import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = sc.nextLine();
        
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a.charAt(j));
            }
            System.out.println();
        }
    }
}
