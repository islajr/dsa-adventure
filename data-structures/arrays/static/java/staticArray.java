
import java.util.random.RandomGenerator;

public class staticArray {
    
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RandomGenerator.getDefault().nextInt(1, 10);  // populating the array with random integers.
        }

        System.out.println("""
                           array 'arr'elements:  
                           --------------------""");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("element #" + (i + 1) + ": \t" + arr[i]);
        }

    }
}