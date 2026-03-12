package AAD1_EXP_5;

public class Q3 {
	public static void max(int[] arr, int i) {
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		int largest = l;
		if (arr[i] < arr.length && arr[l] < arr[i]) {
			largest = l;
		} else if (arr[i] < arr.length && arr[r] < arr[i]) {
			largest = r;
		}
		if (largest != l) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			max(arr, largest);
		}
	}

	public static void del(int[] arr, int i) {
		if (arr.length == i) {
			System.out.println("Largest:" + arr[i]);
		} else {

		}
	}

	public static void main(String[] args) {
		int[] arr = { 8, 5, 7, 4, 1, 6, 3, 2 };
		int index = 0;
		max(arr, index);

		for (int val : arr) {
			System.out.print(val + " ");
		}
	}
}
