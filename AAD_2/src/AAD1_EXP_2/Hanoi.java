package AAD1_EXP_2;

import java.util.Scanner;

public class Hanoi {
	public static void hanoi(int disk, String start, String helper, String end) {
		if (disk == 1) {
			System.out.println("Move disk " + disk + " from " + start + " to " + end);
			return;
		}
		hanoi(disk - 1, start, end, helper);
		System.out.println("Move disk " + disk + " from " + start + " to " + end);
		hanoi(disk - 1, helper, start, end);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of disk:");
		int disk = sc.nextInt();
		hanoi(disk, "A", "B", "C");
		sc.close();
	}

}
