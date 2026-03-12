package AAD1_EXP_3;

public class First_repeated {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6, 7 };
		Integer dup = null;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					dup = arr[i];
				}
			}
		}
		if (dup == null) {
			System.out.println("NO Duplicate");
		} else {
			System.out.println("Duplicate:" + dup);
		}
	}
}
