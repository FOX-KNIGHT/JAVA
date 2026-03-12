package AAD1_EXP_4;

public class Q5 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				for (int k = j; k < arr.length; k++) {
					if (arr[i] == arr[j] || arr[j] == arr[k] || arr[i] == arr[k])
						continue;
					else {
						if (arr[i] + arr[j] > arr[k]) {
							c++;
							System.out.print("{" + arr[i] + "," + arr[j] + "," + arr[k] + "}");
							System.out.println();
						}
					}
				}
			}
		}
		System.out.println("Number of triangles:" + c);
	}
}