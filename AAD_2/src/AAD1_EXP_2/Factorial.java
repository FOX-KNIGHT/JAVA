package AAD1_EXP_2;

import java.util.Scanner;

public class Factorial {
	public static int fact_of(int num, int sum) {
		if (num == 1) {
			return sum;
		} else {
			sum *= num;
			return fact_of(num - 1, sum);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num:");
		int num = sc.nextInt();
		int sum = 1;
		System.out.println(fact_of(num, sum));
		sc.close();
	}

}
