package EXP_1;

public class Q_5 {
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
        nthPreOrder(root, N);
    }

    private void nthPreOrder(Node node, int N) {
        if (node == null) return;
        count++;
        if (count == N) {
            System.out.println("Nth Preorder node value: " + node.data);
            return;
        }
        nthPreOrder(node.lChild, N);
        nthPreOrder(node.rChild, N);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int N = 5;
        Q_5 tree = new Q_5();
        tree.display(arr, N);
    }
}
