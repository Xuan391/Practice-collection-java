package bai9;

import javax.imageio.stream.FileCacheImageInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

public class countWordFileTXT {
    public static void main(String[] args) {
        // Yêu cầu người dùng nhập tên file văn bản

        String filePath = "D:\\TAI_LIEU\\Java\\TechLead intern\\practice_collection_frame\\src\\text.txt";


        try {
            // Đọc nội dung file văn bản
            File file = new File(filePath);
            Scanner fileScanner = new Scanner(file);

            // Tạo một HashMap để lưu trữ từ và số lần xuất hiện
            Map<String, Integer> wordCountMap = new HashMap<>();

            // Đếm số lần xuất hiện của từng từ trong văn bản
            while (fileScanner.hasNext()) {
                String word = fileScanner.next().toLowerCase();
                // Loại bỏ các ký tự không phải là chữ cái
                word = word.replaceAll("[^a-zA-Z]", "");

                // Kiểm tra nếu từ đã có trong map
                if (wordCountMap.containsKey(word)) {
                    // Tăng giá trị số lần xuất hiện của từ lên 1
                    int count = wordCountMap.get(word);
                    wordCountMap.put(word, count + 1);
                } else {
                    // Thêm từ vào map với giá trị số lần xuất hiện là 1
                    wordCountMap.put(word, 1);
                }
            }

            // Hiển thị danh sách từ và số lần xuất hiện tương ứng
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file văn bản.");
        }
    }
}
