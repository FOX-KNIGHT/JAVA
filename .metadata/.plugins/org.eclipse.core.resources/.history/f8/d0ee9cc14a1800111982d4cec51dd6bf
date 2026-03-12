package AAD_1.Experiment_3;

import java.util.Scanner;

public class reduction_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array length:");
        int a = sc.nextInt();
        System.out.print("Enter Array element:");
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        int count = 0;
        while (true) {
            int min = Integer.MAX_VALUE;
            for (int ele : arr) {
                if (ele != 0 && ele < min) {
                    min = ele;
                }
            }

            if (min == Integer.MAX_VALUE)
                break;

            for (int i = 0; i < a; i++) {
                if (arr[i] != 0) {
                    arr[i] -= min;
                }
            }

            count++;
            System.out.print("After reduction " + count + ": ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("Total reductions: " + count);
        sc.close();
    }
}
