
import java.util.ArrayList;
import java.util.random.RandomGenerator;

public class dynamicArray {

    public static void main(String[] args) {
        /* 
         * Dynamic Arrays in Java
         * These can be implemented using ArrayList or similar data structures.
         * Here is a simple example using ArrayList:
         */

         ArrayList<Integer> arr = new ArrayList<>();

         for (int i = 0; i < 10; i++) {
            arr.add(RandomGenerator.getDefault().nextInt(1, 10));   // adding random integers to the array
         }

         System.out.println("""
                 dynamic array 'arr' elements:
                 ----------------------------
                 """);
         for (int i = 0; i < arr.size(); i++) {
            System.out.println("element at index " + (i + 1) + ": \t" + arr.get(i)); // accessing elements
         }
    }       
}