package emmit;

public class emmit {

	public static void main(String[] args) {
		int first = 0;
		int last = 13;
		int key = 205;
		int[] arr = {4, 7, 19, 25, 36, 37, 50, 100, 101, 205, 220, 271, 306, 231};
		int mid;
		int count = 1;
		while (first <= last) {
			mid = (first+last)/2;
			if (arr[mid] == key) {
				System.out.println("Found");
				break;
			} else if (arr[mid] < key)
				first = mid + 1;
			else 
				last = mid -1;
			count++;
		}
		System.out.println(count);
	}

}
