import java.util.Arrays;

public class unsorted {
    public static void main(String[] args) {
        // program to search, insert and delete elements from an unsorted array

        int[] unsorted = {2, 1, 4, 6, 3};

        insert(unsorted);



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
}