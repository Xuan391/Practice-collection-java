package bai9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = scanner.nextLine();

        HashMap<String, Integer> wordCountMap = countWords(text);

        System.out.println("Word Count:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println(word + ": " + count);
        }

        scanner.close();
    }

    // tại sao vẫn đếm phần tử "" ??????????????????????????????????????????????

    public static HashMap<String, Integer> countWords(String text) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();


        // Split the text into words
        String[] words = text.split("\\s+");

        // Loại bỏ các ký tự không phải là chữ cái

        // Count the occurrences of each word
        for (String word : words) {
            word = word.toLowerCase();
            // Loại bỏ các ký tự không phải là chữ cái
            word = word.replaceAll("[^a-zA-Z0-9]", "");
            if(word != "") {
                if (wordCountMap.containsKey(word)) {
                    int count = wordCountMap.get(word);
                    wordCountMap.put(word, count + 1);
                } else {
                    wordCountMap.put(word, 1);
                }
            }
        }

        return wordCountMap;
    }
}
