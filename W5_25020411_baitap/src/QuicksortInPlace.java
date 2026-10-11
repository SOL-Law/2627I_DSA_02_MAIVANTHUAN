import java.util.Scanner;

public class  QuicksortInPlace {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }

        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        quickSort(A, 0, n - 1);
        scanner.close();
    }

    private static void quickSort(int[] A, int low, int high) {
        if (low < high) {
            // Phân chia mảng và lấy vị trí của pivot
            int p = partition(A, low, high);

            // In toàn bộ mảng sau mỗi lần partition thành công
            printArray(A);

            // Đệ quy sắp xếp 2 nửa trái và phải của pivot
            quickSort(A, low, p - 1);
            quickSort(A, p + 1, high);
        }
    }

    private static int partition(int[] A, int low, int high) {
        int pivot = A[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (A[j] <= pivot) {
                swap(A, i, j);
                i++;
            }
        }
        // Đưa pivot về đúng vị trí giữa 2 phân đoạn
        swap(A, i, high);
        return i;
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    private static void printArray(int[] A) {
        for (int k = 0; k < A.length; k++) {
            System.out.print(A[k] + (k == A.length - 1 ? "" : " "));
        }
        System.out.println();
    }
}