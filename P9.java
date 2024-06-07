import java.util.HashSet;
import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Read the elements into an array
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Use a HashSet to remove duplicates
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(array[i]);
        }

        // Convert the HashSet back to an array
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (Integer num : set) {
            uniqueArray[index++] = num;
        }

        // Print the array with duplicates removed
        System.out.println("Array after removing duplicates:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }
}
