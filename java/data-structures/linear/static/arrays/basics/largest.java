import java.util.Arrays;
import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        // program to find the largest element in an array.
        // program to also find the three largest elements in an array.

        int[] myArray = new int[5];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < myArray.length; ++i) {
            System.out.print("Input a number: ");
            myArray[i] = scanner.nextInt();
        }
        scanner.close();    // close scanner to free up memory

       int largest = myArray[0];
       int two = 0;
       int three = 0;
       for (int i : myArray) {
            if (i > largest) {
                largest = i;
            }
       }

       for (int i: myArray) {
            if (i < largest && i > two) {
                two = i;
            }
       }

       for (int i : myArray) {
        if (i < largest && i < two && i > three) {
            three = i;
        }
       }

       System.out.println("The largest number in this array is: " + largest);
       System.out.println("The second largest number is: " + two);
       System.out.println("The third largest number is: " + three);
    }
}