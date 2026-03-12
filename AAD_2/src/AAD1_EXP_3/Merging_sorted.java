package AAD1_EXP_3;

public class Merging_sorted {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7, 9 };
		int[] arr2 = { 0, 2, 4, 6, 8 };
		int[] arr3 = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr3[arr1.length + i] = arr2[i];
		}
		System.out.print("Array:");
		for (int ele : arr3) {
			System.out.print(ele + " ");
		}
		System.out.println();
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (arr3[i] < arr3[j]) {
					int temp = arr3[i];
					arr3[i] = arr3[j];
					arr3[j] = temp;
				}
			}
		}
		System.out.print("Sorted Array:");
		for (int ele : arr3) {
			System.out.print(ele + " ");
		}
	}
}
