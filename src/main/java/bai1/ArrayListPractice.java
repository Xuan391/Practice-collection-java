package bai1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        numbers.add(10);
        numbers.add(5);
        numbers.add(23);

        System.out.println(numbers);

        int sum = 0;
        for(int s : numbers ){
            sum += s;
        }
        System.out.println("Tong la: " + sum);

        System.out.println("Gia tri lon nhat: " + Collections.max(numbers));
        System.out.println("Gia tri nho nhat: " + Collections.min(numbers));

        int numRemove = 4;
        numbers.remove(Integer.valueOf(numRemove)); // ep kieu tu int thanh Integer vi remove nhan tham so la collection
        System.out.println("Day sau khi xoa phan tu "+ numRemove+ " la: "+ numbers);

        int numCheck = 23;
        boolean check = numbers.contains(Integer.valueOf(numCheck));
        if(check == true){
            System.out.println("phan tu "+ numCheck+ " ton tai trong day");
        } else {
            System.out.println("phan tu "+numCheck+ " khong ton tai trong day");
        }

    }
}
