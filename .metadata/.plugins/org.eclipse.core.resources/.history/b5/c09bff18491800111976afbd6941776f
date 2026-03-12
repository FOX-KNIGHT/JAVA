package AAD_1.Experiment_4;

public class Q4 {

	public static void main(String[] args) {
		int[] arr = { 4, 8, 1, 2, 16, 15 };
		int sum = 0;
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum - (arr[i] + arr[j])) {
					num1 = arr[j];
					num2 = arr[i];
				}
			}
		}
		System.out.println(num1 + " " + num2);
	}

}
