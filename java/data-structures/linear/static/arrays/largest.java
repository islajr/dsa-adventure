import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        // program to find the largest element in an array.

        int[] myArray = new int[5];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < myArray.length; ++i) {
            System.out.print("Input a number: ");
            myArray[i] = scanner.nextInt();
        }
        scanner.close();    // close scanner to free up memory

       int largest = myArray[0];
       for (int i : myArray) {
            if (i > largest)
                largest = i;
       }

       System.out.println("The largest number in this array is: " + largest);
    }
}