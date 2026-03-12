package AAD2_EXP_1;

public class Q_3 {
    class Node {
        int data;
        Node lChild, rChild;
        Node(int v) {
            data = v;
        }
    }

    Node root;

    private Node buildTree(int[] arr, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);
        node.lChild = buildTree(arr, start, mid - 1);
        node.rChild = buildTree(arr, mid + 1, end);
        return node;
    }

    public void display(int[] arr) {
        root = buildTree(arr, 0, arr.length - 1);
        in(root);
    }

    private void in(Node node) {
        if (node != null) {
        	in(node.lChild);
            System.out.print(node.data + " ");
            in(node.rChild);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Q_3 tree = new Q_3();
        tree.display(arr);
    }
}
