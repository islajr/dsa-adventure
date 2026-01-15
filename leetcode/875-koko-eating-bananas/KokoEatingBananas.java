import java.util.Arrays;

/* * 
 * LC 875: Koko Eating Bananas
 * 
 * Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
 * Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. 
 * If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
 * 
 * Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
 * 
 * Return the minimum integer k such that she can eat all the bananas within h hours.
*/
public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = Arrays.stream(piles).max().getAsInt();
        int result = r;

        while (l <= r) {
            int k = (l + r) / 2;

            long time = 0;

            for (int p : piles)
                time += Math.ceil((double) p / k);

            if (time <= h) {
                result = k;
                r = k - 1;
            } else 
                l = k + 1;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] pile = {25, 10, 23, 4};
        System.out.println(minEatingSpeed(pile, 4));
    }
}