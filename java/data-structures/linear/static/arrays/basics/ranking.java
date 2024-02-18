import java.util.Scanner;

public class ranking {
    public static void main(String[] args) {
        // program to sort an array in ascending order
        int[] myArray = new int[5];
        Scanner scanner = new Scanner(System.in);
        
        int length;
        System.out.print("How many elements do you want in your array? ");
        length = scanner.nextInt() - 1;

        int sub;

        for (int i = 0; i <= length; ++i) {
            System.out.print("Array Element " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();

        }

        sort(myArray, myArray.length);

        scanner.close();

        // proceeding to print the array
        for (int i : myArray) {
            System.out.println(i);
        }


    }

    public static int [] sort(int[] array, int length) {
        int current;
        for (int i = 0; i <= length; ++i) {
            for (int j = 0; j <= length; ++j) {
                if (array[j] < array[i]) {
                    current = array[i];
                    array[i] = array[j];
                    array[j] = current;
                }
            }
        }
        
        return array;
    }
}