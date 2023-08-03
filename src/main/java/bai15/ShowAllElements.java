package bai15;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ShowAllElements {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số lượng phần tử mảng 1: ");
        int n = scanner.nextInt();
        System.out.println("Mảng 1: ");
        int[] nums1 = new int[n];
        for (int i=0; i<n; i++){
            nums1[i] = scanner.nextInt();
        }

        System.out.println("Số lượng phần tử mảng 2: ");
        int m = scanner.nextInt();
        System.out.println("Mảng 2: ");
        int[] nums2 = new int[m];
        for (int i=0; i<m; i++){
            nums2[i] = scanner.nextInt();
        }

        System.out.println("Các phần tử của hai tập hợp là: ");
        Set<Integer> commonElements = showAllElement(nums1, nums2);
        for (int i: commonElements){
            System.out.print(i + " ");
        }

    }
    public static Set<Integer> showAllElement(int[] arr1, int[] arr2){
        Set<Integer> allElements = new HashSet<>();

        for (int i=0; i< arr1.length; i++){
            allElements.add(arr1[i]);
        }
        for (int j=0; j< arr2.length; j++){
            allElements.add(arr2[j]);
        }
        return allElements;
    }
}
