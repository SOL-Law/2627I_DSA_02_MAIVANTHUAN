import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class W4_25020411 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Đọc số lượng bài báo N
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();

        // Sử dụng Integer thay vì int để sắp xếp giảm dần dễ dàng
        Integer[] citations = new Integer[n];
        for (int i = 0; i < n; i++) {
            citations[i] = sc.nextInt();
        }

        // Sắp xếp mảng lượt trích dẫn theo thứ tự giảm dần
        Arrays.sort(citations, Collections.reverseOrder());

        // Tính h-index
        int hIndex = 0;
        for (int i = 0; i < n; i++) {
            // i + 1 là số lượng bài báo xét đến thời điểm hiện tại
            if (citations[i] >= i + 1) {
                hIndex = i + 1;
            } else {
                // Do mảng đã sắp xếp giảm dần, nếu điều kiện không thỏa mãn thì dừng lại
                break;
            }
        }

        // In ra kết quả
        System.out.println(hIndex);

        sc.close();
    }
}