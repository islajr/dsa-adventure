import java.util.Scanner;

public class unsorted {
    public static void main(String[] args) {
        // program to search, insert and delete elements from an unsorted array
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hello there, I'm to create an array for you.");
            System.out.print("How long do you want your array to be? ");
            int length = scanner.nextInt();

            // creating the array with the desired length
            int[] array = new int[length];
            for (int i = 0; i < length; ++i) {
                System.out.print("Please input a desired array value: ");
                array[i] = scanner.nextInt();
            }

            /* // printing out the array
            System.out.print("Your array: {");
            for (int i = 0; i < length; ++i) {
                if (i == length - 1) {
                    System.out.print(i + "}\n");
                }
                else {
                    System.out.print(i + ", ");
                }
            } */
            arrayToStdout(array);

            // asking for the next step
            System.out.println("What do you wish to do with your array?");
            System.out.print("(S)Search, (I)Insert, (D)Delete, (Q)Quit. ");
            String response = scanner.next();
            response = response.strip().toLowerCase();

            switch (response) {
                case "q":
                    System.out.println("See you later, mate.");
                    System.exit(0);
                case "s":
                    System.out.print("What element are you looking to find? ");
                    int searchAnswer = scanner.nextInt();
                    search(array, searchAnswer);
                    System.exit(0);
                case "i":
                    System.out.print("What number do you want to add to the array? ");
                    int insertAnswer = scanner.nextInt();
                    insert(array, insertAnswer);
                    break;
                case "d":
                    System.out.print("What element don't you like? ");
                    int deleteAnswer = scanner.nextInt();
                    delete(array, deleteAnswer);
                    break;
                default:
                    break;
            }
            scanner.close();


        }
        
    }

    // searching function
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

    //  function for inserting
    public static int[] insert(int[] array, int value) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < newArray.length; ++i) {
            if (i == newArray.length - 1) {
                newArray[i] = value;
            }
            else {
                newArray[i] = array[i];
            }
        }

        return newArray;
    }

    // function for deletion...
    public static int[] delete(int[] array, int element) {
        int[] newArray = new int[array.length - 1];
        
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == element) {
                for (int j = i; j < array.length - 1; ++j) {
                    newArray[j] = array[j + 1];
                }
                break;
            }
            else {
                newArray[i] = array[i];
            }
        }

        if (newArray.equals(array)) {
            System.out.println("This value is not in the array!");
        }
        return newArray;
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
}