import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  Partition {

    public static void partition(int[] ar) {
        int pivot = ar[0];

        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        // Chia các phần tử vào 3 danh sách
        for (int num : ar) {
            if (num < pivot) {
                left.add(num);
            } else if (num == pivot) {
                equal.add(num);
            } else {
                right.add(num);
            }
        }

        // Gộp kết quả lại mảng ar
        int index = 0;
        for (int num : left) {
            ar[index++] = num;
        }
        for (int num : equal) {
            ar[index++] = num;
        }
        for (int num : right) {
            ar[index++] = num;
        }

        // In kết quả
        printArray(ar);
    }

    static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        partition(ar);
        in.close();
    }
}