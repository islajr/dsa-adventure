# LC 875: [Koko Eating Bananas]


> **Date:** [2026-10-13]

> **Description:** [LC 875](https://leetcode.com/problems/koko-eating-bananas/description/)

> **Difficulty:** [Medium]

> **Category:** [[dsa-concepts#[Binary Search|Binary Search]]

## Approach

### [Brute Force]

> **Time Complexity:** $O(m * n)$

> **Space Complexity:** $O(1)$

This problem requires us to figure out a minimum eating speed for "koko" such that she can eat all bananas present in `piles` within `h` hours. We are constrained to integers, and are allowed to select an *banana-per-hour* eating rate of `k`. If a pile has less than `k` bananas, we may finish eating the pile, but cannot eat from another pile within the same hour.

A good approach would be to try each speed from `1` and try to compute each total time. Once we get one that sits under the total allowed hours `h`, we have our answer.

``` java
public int minEatingSpeed(int[] piles, int h) {
	int speed = 1;
	
	while (true) {
		long totalTime = 0;
		for (int pile : piles) totalTime += (int) Math.ceil((double) pile / speed);
		if (totalTime <= h) return speed;
		speed++;
	}
}
```
---
### [Binary Search]

> **Time Complexity:** $O(n * \log m)$

> **Space Complexity:** $O(1)$

Instead of checking every speed mindlessly, we simply make a key observation that the total time needed to the entire pile decreases as the speed increases. This means that the answer lies within a sorted space of `1` to `max(piles)`.

With this observation, it is possible to conduct a binary search to find the minimum eating speed required to complete the piles of bananas. We use binary search to find a suitable eating speed and then compute the total required time to complete the banana pile. If it falls in the required range, it is stored in a variable and a lower speed is tried. Otherwise, a higher speed is tried. The case for terminating this loop is if or when the lower and upper speed bounds intersect.

``` java
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;

        while (l <= r) {
            int k = (l + r) / 2;
            long totalTime = 0;
            for (int p : piles) totalTime += Math.ceil((double) p / k);

            if (totalTime <= h) {
                res = k;    // store current speed
                r = k - 1;  // try lower speed
            } else l = k + 1;   // try higher speed
        }
        return res;
    }
}
```

---
*Tags: #dsa #leetcode #binary-search*
