package bai10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bai10 {
        public static void main(String[] args) {
            // Yêu cầu người dùng nhập danh sách điểm số
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập số lượng sinh viên: ");
            int numStudents = scanner.nextInt();

            // Tạo một HashMap để lưu trữ điểm số và số lượng sinh viên đạt điểm tương ứng
            Map<Double, Integer> scoreMap = new HashMap<>();

            // Nhập điểm số của từng sinh viên và cập nhật số lượng sinh viên theo phân phối điểm số
            for (int i = 0; i < numStudents; i++) {
                System.out.print("Nhập điểm số của sinh viên thứ " + (i + 1) + ": ");
                double score = scanner.nextDouble();

                // Kiểm tra điểm số đã tồn tại trong map hay chưa
                if (scoreMap.containsKey(score)) {
                    // Nếu điểm số đã tồn tại, tăng số lượng sinh viên đạt điểm tương ứng lên 1
                    int count = scoreMap.get(score);
                    scoreMap.put(score, count + 1);
                } else {
                    // Nếu điểm số chưa tồn tại, thêm điểm số vào map với số lượng sinh viên là 1
                    scoreMap.put(score, 1);
                }
            }

            // Tính số lượng sinh viên đạt điểm cao (>= 8.0)
            int highScoreCount = getScoreCount(scoreMap, 8.0, Double.MAX_VALUE);
            // Tính số lượng sinh viên đạt điểm trung bình (>= 5.0 và < 8.0)
            int averageScoreCount = getScoreCount(scoreMap, 5.0, 8.0);
            // Tính số lượng sinh viên trượt (dưới 5.0)
            int failScoreCount = getScoreCount(scoreMap, Double.MIN_VALUE, 5.0);

            // Hiển thị kết quả
            System.out.println("Số lượng sinh viên đạt điểm cao: " + highScoreCount);
            System.out.println("Số lượng sinh viên đạt điểm trung bình: " + averageScoreCount);
            System.out.println("Số lượng sinh viên trượt: " + failScoreCount);

            scanner.close();
        }

        public static int getScoreCount(Map<Double, Integer> scoreMap, double minScore, double maxScore) {
            int count = 0;
            for (Map.Entry<Double, Integer> entry : scoreMap.entrySet()) {
                double score = entry.getKey();
                if (score >= minScore && score < maxScore) {
                    count += entry.getValue();
                }
            }
            return count;
        }
}
