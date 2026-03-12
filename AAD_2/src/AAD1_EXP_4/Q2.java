package AAD1_EXP_4;

public class Q2 {
	public static void main(String[] args) {
		int[] x = { 1, 5, 4, 3, 7 };
		int[] y = { 2, 9, 6, 7, 8 };
		int key = 4;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				if (x[i] - y[j] == key || y[j] - x[i] == key) {
					System.out.println(x[i] + " " + y[j]);
				}
			}
		}
	}

}
