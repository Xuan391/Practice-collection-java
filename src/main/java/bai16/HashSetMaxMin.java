package bai16;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetMaxMin {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        System.out.print("Nhập số lượng phần tử của tập hợp: ");
        int n = scanner.nextInt();

        System.out.println("Nhập các phần tử của tập hợp:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            set.add(element);
        }


        System.out.println("Phần tử nhỏ nhất trong tập hợp: " + Collections.min(set));
        System.out.println("Phần tử lớn nhất trong tập hợp: " + Collections.max(set));

        scanner.close();
    }
}
