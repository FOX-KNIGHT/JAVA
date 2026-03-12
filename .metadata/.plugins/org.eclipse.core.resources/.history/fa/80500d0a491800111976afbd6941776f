package AAD_1.Experiment_2;

import java.util.Scanner;

public class Fibonacci {
	public static int fab(int a, int b, int fibo, int sum) {
		if (fibo == 0) {
			return sum;
		} else {
			System.out.print(sum + " ");
			sum = a + b;
			a = b;
			b = sum;
			return fab(a, b, fibo - 1, sum);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter limit:");
		int fibo = sc.nextInt();
		int sum = 0;
		int a = 0;
		int b = 1;
		System.out.println(fab(a, b, fibo, sum));
		sc.close();
	}

}
