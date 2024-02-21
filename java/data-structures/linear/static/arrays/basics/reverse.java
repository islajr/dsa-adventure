import java.util.Random;

public class reverse {
    public static void main(String[] args) {
        // program to reverse an array
        int[] myArray = new int[10];
        int[] newArray = new int[myArray.length];
        myArray = generate(10);   // generates a pseudo-random array.

        for (int i = 0; i < myArray.length; ++i) {
            newArray[(myArray.length - 1) - i] = myArray[i];
        }

        System.out.print("Original:");
        for (int i : myArray) {
            System.out.print(" " + i);
        }

        System.out.print("\nReversed:");
        for (int i : newArray) {
            System.out.print(" " + i);
        }


    }

    public static int[] generate(int length) {
        int[] myArray = new int[length];
        Random random = new Random();
        
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(101);
        }
        return myArray;
    }
}