public class Bai3_Insertion {

    // Cách 1: Sử dụng Đệ quy
    public static Node insertRecursive(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
            root.left = insertRecursive(root.left, val);
        } else if (val > root.data) {
            root.right = insertRecursive(root.right, val);
        }
        return root;
    }

    // Cách 2: Sử dụng Vòng lặp
    public static Node insertIterative(Node root, int val) {
        Node newNode = new Node(val);
        if (root == null) return newNode;

        Node parent = null;
        Node curr = root;
        while (curr != null) {
            parent = curr;
            if (val < curr.data) {
                curr = curr.left;
            } else if (val > curr.data) {
                curr = curr.right;
            } else {
                return root; // Giá trị trùng lập
            }
        }

        if (val < parent.data) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }

        return root;
    }
}