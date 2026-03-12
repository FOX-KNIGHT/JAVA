package AAD1_EXP_6;

import java.util.Scanner;

public class Q1 {
	static Scanner sc = new Scanner(System.in);

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void insert(int[] arr, int i) {
		System.out.println("Insert at\n1.Start\n2.Mid\n3.End");
		int ch = sc.nextInt();
		switch (ch) {
			case 1:
		}

	}

	public static void main(String[] args) {
		System.out.print("Enter Array length:");
		int a = sc.nextInt();
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.print("[ ");
		for (int i = 0; i < a; i++) {
			System.out.print(arr[i] + " ");
			;
		}
		System.out.println("]");
		System.out.print("Enter your choice\n1.INSERT\n2.DELETE\n3.SEARCH");
		int ch = sc.nextInt();
		switch (ch) {
			case 1:
				System.out.print("Enter element to insert:");
				int ele = sc.nextInt();
				insert(arr, ele);
		}

	}

}
