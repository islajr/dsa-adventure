public class unsorted {
    public static void main(String[] args) {
        // program to search, insert and delete elements from an unsorted array

        int[] unsorted = {2, 1, 4, 6, 3};

        int[] newArray = delete(unsorted, 6);

        for (int i : newArray) {
            System.out.println(i);
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

    //  function fot inserting
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
}