package AAD_1.Experiment_5;

public class Q2 {
    public static void increase(int[] arr, int i, int key) {
        if (key < arr[i]) {
            System.out.println("Enter bigger number");
        } else {
            arr[i] = key;
            while (i > 0 && arr[(i - 1) / 2] < arr[i]) {
                int temp = arr[i];
                arr[i] = arr[(i - 1) / 2];
                arr[(i - 1) / 2] = temp;
                i = (i - 1) / 2;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 8, 5, 7, 4, 1, 6, 3, 2 };
        int index = 4;
        increase(arr, index, 10);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}