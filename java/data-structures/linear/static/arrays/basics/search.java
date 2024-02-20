import java.util.Random;
import java.util.Scanner;

public class search{
    public static void main(String[] args) {
        // program to search an array for an element and return the index.

        int[] numbers = new int[10];
        Random random = new Random();
        
        for (int i = 0; i < numbers.length; ++i) {
            numbers[i] = random.nextInt(101);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number to search: ");
        int response = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < numbers.length; ++i) {
            if (response == numbers[i]) {
                System.out.println("The index of the number is " + i + ".");
                break;
            }
            else {
                System.out.println("This number is not in the array");
                break;
            }
        }
    }
}