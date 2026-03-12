package AAD_1.Experiment_3;

import java.util.Scanner;

public class Selection_sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Terms:");
		int num = sc.nextInt();
		int temp = 0;
		System.out.print("Enter Elements:");
		int[] ele = new int[num];
		for (int i = 0; i < num; i++) {
			ele[i] = sc.nextInt();
		}
		for (int i : ele) {
			System.out.println(i + " ");
		}
		for (int i = 0; i < num; i++) {
			int index = i;
			for (int j = i; j < num; j++) {
				if (ele[j] < ele[index]) {
					index = j;
				}
			}
			temp = ele[i];
			ele[i] = ele[index];
			ele[index] = temp;
		}

		System.out.println("Sorted Array:");
		for (int i : ele) {
			System.out.print(i + " ");
		}
		sc.close();
	}

}
