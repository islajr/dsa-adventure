import java.util.Scanner;

public class search{
    public static void main(String[] args) {
        // program to search an array for an element and return the index.

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number to search: ");
        int response = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < numbers.length; ++i) {
            if (response == numbers[i]) {
                System.out.println("The index of the number is " + i + ".");
            }
            else {
                System.out.println("This number is not in the array");
            }
        }
    }
}