package AAD_1.Experiment_2;

import java.util.Scanner;

public class Linear_search {
	public static int lin(int num, int[] arr, int a) {
		if (a == 0) {
			return -1;
		}
		if (arr[a] == num) {
			return a;
		}
		return lin(num, arr, a - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array length:");
		int a = sc.nextInt();
		System.out.print("Enter Array element:");
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("{ ");
		for (int i = 0; i < a; i++) {
			System.out.print(arr[i] + " ");
			;
		}
		System.out.println("]");

		System.out.print("Enter element to search:");
		int num = sc.nextInt();
		System.out.println(lin(num, arr, a));
		sc.close();
	}
}
