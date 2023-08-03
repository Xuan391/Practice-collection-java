package bai13;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetDuplicateElement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số lượng phần tử: ");
        int n = scanner.nextInt();

        int [] arr = new int[n];
        System.out.println("Nhập mảng: ");
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Phần tử trùng là: ");
        Set<Integer> duplicateElements = findDuplicateElement(arr);
        for (int i : duplicateElements){
            System.out.print(i+ " ");
        }
    }
    public static Set<Integer> findDuplicateElement(int[] arr){
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicateElements = new HashSet<>();

        for (int i : arr){
            if(!set.add(i)){
                duplicateElements.add(i);
            }
        }
        return duplicateElements;
    }
}
