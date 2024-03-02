import java.util.NoSuchElementException;
import java.util.Scanner;

public class Sorted {

    public static void main(String[] args) {
        // program to search, insert and delete elements from a sorted array
        start();

    }
    
    // search method
    public static void search(int[] array, int value) {
        int index = -1;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println(value + " is present at index " + index + ".");
        }
        else {
            System.out.println(value + " was not found.");
        }
    }

    public static int[] sort(int[] array, int value) {
        
        // sorting using the selection sort algorithm
        int current;
        for (int i = 0; i < array.length; ++i) {    // outer loop to traverse the array length
            int j = i;
            while (j < array.length) {      // inner loop to work the array internally
                if (array[j] < array[i]) {
                    current = array[i];
                    array[i] = array[j];
                    array[j] = current;
                }
                ++j;
            }
        }

        return array;
    }

    public static void arrayToStdout(int[] array) {
        // printing out the array
        System.out.print("Your array: {");
        for (int i = 0; i < array.length; ++i) {
            if (i == array.length - 1) {
                System.out.print(array[i] + "}\n");
            }
            else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    // program starts here
    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, I'm to create an array for you.");
        System.out.print("How many elements would you like in this array? ");
        int length = 0;

        try {
            length = scanner.nextInt();
        } 
        catch (NoSuchElementException e) {
            System.out.println("Please input only integers. ");
            scanner.close();
            // start();
            System.exit(0);
        }

        int[] array = new int[length];

        // storing numbers in array]
        for (int i = 0; i < length; ++i) {
            System.out.print("Array element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // sorting array in ascending order
        int[] sorted = sort(array, 1);

        arrayToStdout(sorted);

        // remember to add search, insert and delete features.
        System.out.println("What do you want to do? ");
        System.out.print("(S)Search, (I)Insert, (D)Delete? ");

        String response = scanner.next();
        response = response.strip().toLowerCase();
        
        switch (response) {
            case "s":
                System.out.println("You have chosen to search for an element. ");
                System.out.print("What are you looking for? ");
                int searchValue = scanner.nextInt();
                search(array, searchValue);
                break;

            case "i":
                System.out.println("What do you want to add?");
        
            default:
                break;
        }


    }
}