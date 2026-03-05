package AAD_1.Experiment_3;

public class Q8 {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 19, 18, 25, 6 };
		int max1 = 0;
		int max2 = 0;
		int min1 = 0;
		int min2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > min1) {
				max1 = arr[i];
			}
			if (arr[i] < max1) {
				max2 = arr[i];
			}
		}
		System.out.println(max1 + " " + max2);
	}
}