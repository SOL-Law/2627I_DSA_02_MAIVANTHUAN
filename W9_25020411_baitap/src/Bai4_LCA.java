public class Bai4_LCA {

    // Tìm Tổ tiên chung gần nhất (LCA) bằng Đệ quy
    public static Node lca(Node root, int v1, int v2) {
        if (root == null) {
            return null;
        }

        // Cả 2 giá trị nằm ở nhánh bên trái
        if (v1 < root.data && v2 < root.data) {
            return lca(root.left, v1, v2);
        }

        // Cả 2 giá trị nằm ở nhánh bên phải
        if (v1 > root.data && v2 > root.data) {
            return lca(root.right, v1, v2);
        }

        // Điểm phân nhánh -> Nút hiện tại chính là LCA
        return root;
    }
}