package AAD1_EXP_3;

public class Check_reverse {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 7, 6, 5, 4, 3, 8, 9 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[i]) {
					if (arr[j + 1] > arr[i + 1]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
		System.out.print("Sorted Array:");
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
	}
}
////