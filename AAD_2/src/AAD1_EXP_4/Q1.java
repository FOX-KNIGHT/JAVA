package AAD1_EXP_4;

public class Q1 {
	public static void main(String[] args) {
		int[] arr = { 36, 19, 29, 12, 5 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length - 1; j++) {
				if (arr[i] > arr[j + 1]) {
					int temp = 0;
					temp = arr[i];
					arr[i] = arr[j + 1];
					arr[j + 1] = temp;
				}
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
		int k = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				k = 0;
			} else {
				k = 1;
			}
		}
		if (k == 0) {
			System.out.println("It is in Ascending order");
		} else {
			System.out.println("It is in Descending order");
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}