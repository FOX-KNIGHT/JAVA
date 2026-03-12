package AAD2_EXP_1;

public class Q_1 {

	static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
        }
    }

    static Node build(int arr[], int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        Node root = new Node(arr[mid]);

        root.left = build(arr, start, mid - 1);
        root.right = build(arr, mid + 1, end);

        return root;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Node root = build(arr, 0, arr.length - 1);
        System.out.println("Tree Created Successfully");
    }
}
