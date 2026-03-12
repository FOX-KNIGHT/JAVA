package AAD1_EXP_2;

import java.util.Scanner;

public class deci_to_hexa {
	public static int convo(int num) {
		if (num < 16) {
			return num;
		}
		int res = num % 16;
		convo(num / 16);
		switch (num) {
			case (11):
				System.out.println("A");
			case (12):
				System.out.println("B");
			case (13):
				System.out.println("C");
			case (14):
				System.out.println("D");
			case (15):
				System.out.println("E");
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int num = sc.nextInt();
		System.out.println(convo(num));
		sc.close();

	}
}
