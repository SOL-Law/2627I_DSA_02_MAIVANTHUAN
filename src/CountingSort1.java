import java.util.Scanner;

public class CountingSort1 {

    public static int[] countingSort(int[] arr) {
        // Khởi tạo mảng đếm gồm 100 phần tử (từ 0 đến 99) mặc định là 0
        int[] count = new int[100];

        // Đếm số lần xuất hiện của từng phần tử
        for (int num : arr) {
            count[num]++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] result = countingSort(arr);

        // In kết quả ra màn hình, các số cách nhau bởi khoảng trắng
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]);
            if (i < result.length - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());

        scanner.close();
    }
}