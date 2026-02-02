/* *
 * LC 1011: Capacity To Ship Packages Within D Days
 *
 * A conveyor belt has packages that must be shipped from one port to another within days days. 
 * The ith package on the conveyor belt has a weight of weights[i]. 
 * Each day, we load the ship with packages on the conveyor belt (in the order given by weights). 
 * We may not load more weight than the maximum weight capacity of the ship. 
 * 
 * Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.
*/
public class CapacityToShip {
	public int shipWithinDays(int[] weight, int days) {
		int l = 0, r = 0;

		// compute upper and lower bounds
		for (int w : weights) {
			l = Math.max(l, w);
			r += w;
		}

		int res = r;

		while (l <= r) {
			int mid = (l + r) / 2;

			if (canShip(weights, days, mid)) {
				res = Math.min(res, mid);
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}

		return res;
	}

	public boolean canShip(int[] weights, int days, int mid) {
		int ships = 1, currMid = mid;

		for (int w : weights) {
			if (currMid - w < 0) {
				ships++;
				if (ships > days)
					return false;
				currMid = mid;
			}

			currMid -= w;
		}

		return true;
	}
}
