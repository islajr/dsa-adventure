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
            sub = scanner.nextInt();

            if (i + 1 == 1) {   // if it is the first element of the array
                myArray[0] = sub;
            }
            else {

                for (int j = 0; j <= i; ++j) {
                    if (sub < myArray[j]) {
                       adjust(myArray, sub, i, j);
                    }
                    else {
                        continue;
                    }
                }
            }

        }

        scanner.close();

        // proceeding to print the array
        for (int i : myArray) {
            System.out.println(i);
        }


    }

    public static int [] adjust(int[] array, int value, int current, int index) {

        for (int i = current; i >= 0; --i) {
            if (i == index)
                array[i + 1] = array[i];
            else
                array[i] = value;
        }
        return array;
    }
}