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

    public static int[] insert(int[] oldArray, int value) {
        int[] newArray = new int[oldArray.length + 1];
        boolean inserted = false;

        for (int i = 0; i < oldArray.length; ++i) {
            if (value > oldArray[i]) {
                newArray[i] = oldArray[i];
            }
            else if (value < oldArray[i]){
                newArray[i] = value;
                for (int j = i + 1; j <= oldArray.length; ++j){
                    newArray[j] = oldArray[j-1];
                }
                inserted = true;
                break;
            }
            else if (i == oldArray.length){
                newArray[i] = value;
                break;
            }
        }

        if (inserted == false) {
            newArray[newArray.length - 1] = value;
        }

        return newArray;
    }

    public static int[] delete(int[] array, int value) {
        int[] newArray = new int[array.length - 1];
        boolean deleted = false;

        for (int i = 0; i < array.length; ++i) {
            if (value == array[i]) {
                for (int j = i + 1; j < array.length; ++j) {
                    newArray[j - 1] = array[j]; 
                }
                deleted = true;
                break;
            }
            else {
                newArray[i] = array[i];
            }
        }

        if (deleted == false) {
            System.out.println("The element was not found! ");
        }
        else {
        }

        return newArray;
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
        while (true) {
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
                System.out.print("What do you want to add? ");
                int insertValue = scanner.nextInt();
                int[] insertedArray = insert(array, insertValue);
                arrayToStdout(insertedArray);
                break;
            
            case "d":
                System.out.print("What do you want to delete? ");
                int deleteValue = scanner.nextInt();
                int[] deletedArray = delete(array, deleteValue);
                System.out.println("You have successfully deleted " + deleteValue + ".");
                arrayToStdout(deletedArray);
                break;
        
            default:
                break;
        }

        System.out.print("Do you want to continue? (Y)Yes or (N)No ");
        String continueResponse = scanner.next();

        continueResponse = continueResponse.strip().toLowerCase();

        switch (continueResponse) {
            case "y":
                break;
            
            case "n":
                System.out.println("Bye! ");
                System.exit(0);;
                break;
            default:
                break;
                
        }

        }

    }
}