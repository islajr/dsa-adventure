import java.util.ArrayList;
import java.util.List;

/* BinarySearch: java implementation of binary search */
public class BinarySearch {

	/* binarySearch returns an Integer if found, and 'null' if not found */
	static Integer binarySearch(List<Integer> list, Integer item) {
		int lower = 0;
		int upper = list.size() - 1;

		while (lower <= upper) {
			int mid = (lower + upper) / 2;
			int guess = list.get(mid);

			if (guess == item)
				return mid;

			else if (guess < item)
				lower = mid + 1;

			else
				upper = mid - 1;

		}

		return null;
	}

	/* test case */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(10);
		list.add(24);
		list.add(56);
		list.add(68);
		list.add(72);
		list.add(76);
		list.add(88);
		list.add(102);
		list.add(155);
		list.add(208);

		System.out.println(binarySearch(list, 102));
	}

}

