package EXP_1;

public class Q_6 {
    class Node {
        int data;
        Node lChild, rChild;
        Node(int v) {
            data = v;
        }
    }

    Node root;
    int count;

    private Node buildTree(int[] arr, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);
        node.lChild = buildTree(arr, start, mid - 1);
        node.rChild = buildTree(arr, mid + 1, end);
        return node;
    }

    public void display(int[] arr, int N) {
        root = buildTree(arr, 0, arr.length - 1);
        count = 0;
        post(root, N);
    }

    private void post(Node node, int N) {
        if (node == null) return;
        post(node.lChild, N);
        post(node.rChild, N);
        count++;
        if (count == N) {
            System.out.println("Nth Postorder node value: " + node.data);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int N = 5;
        Q_6 tree = new Q_6();
        tree.display(arr, N);
    }
}
