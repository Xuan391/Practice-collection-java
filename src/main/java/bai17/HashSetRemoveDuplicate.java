package bai17;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetRemoveDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> set = new HashSet<>();

        System.out.print("Nhập số lượng phần tử của tập hợp: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự '\n' sau khi nhập số lượng

        System.out.println("Nhập các phần tử của tập hợp:");
        for (int i = 0; i < n; i++) {
            String element = scanner.nextLine();
            set.add(element);
        }

        System.out.println("Tập hợp sau khi xóa các phần tử trùng lặp:");
        for (String element : set) {
            System.out.println(element);
        }

        scanner.close();
    }
}
