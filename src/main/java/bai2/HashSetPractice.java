package bai2;

import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args){
        HashSet<String> countrySet = new HashSet<>();
        countrySet.add("Viet Nam");
        countrySet.add("Lao");
        countrySet.add("Campuchia");
        countrySet.add("Thai Lan");
        countrySet.add("Trung Quoc");

        System.out.println(countrySet);

        String countryCheck = "Viet Nam";
        boolean check = countrySet.contains(countryCheck);
        if (check == true){
            System.out.println("Quoc gia " + countryCheck + " ton tai trong danh sach" );
        } else {
            System.out.println("Quoc gia " + countryCheck + " khong ton tai trong danh sach");
        }

        String countryRemove = "Trung Quoc";
        countrySet.remove(countryRemove);
        System.out.println(countrySet);

        System.out.println(" so luong quoc gia la: " + countrySet.size());
    }
}
