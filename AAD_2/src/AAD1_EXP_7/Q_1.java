package AAD1_EXP_7;

import java.util.Scanner;

public class Q_1 {
	static int top = 0;
	static int end = 5;
	static Scanner sc = new Scanner(System.in);

	public static void push(int[] stack, int val) {
		if (top == end) {
			System.out.println("Stack overflow");
		} else {
			stack[top++] = val;
		}
	}

	public static void pop(int[] stack) {
		if (end == top) {
			System.out.println("Stack underflow");
		} else {
			System.out.println(stack[top--] + "element poped");
			disp(stack);
		}
	}

	public static void disp(int[] stack) {
		int a = stack.length;
		System.out.print("[ ");
		for (int i = 0; i < a; i++) {
			System.out.print(stack[i] + " ");
			;
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		System.out.print("Enter Array length:");
		int a = sc.nextInt();
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();

		}

		System.out.print("Enter your choice\n1.INSERT\n2.DELETE");
		int ch = sc.nextInt();
	}
}
