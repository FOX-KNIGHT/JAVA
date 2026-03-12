package AAD1_EXP_3;

public class Missing_number {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 7 };
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] + 1 != arr[i + 1]) {
				System.out.println(arr[i] + 1 + " ");
			}
		}
	}
}
