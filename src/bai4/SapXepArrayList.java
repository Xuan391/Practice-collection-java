package bai4;

import java.util.ArrayList;
import java.util.Collections;

public class SapXepArrayList {
    public static void main(String[] args){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(16);
        integers.add(12);
        integers.add(32);
        integers.add(6);
        integers.add(14);

        Collections.sort(integers);
        System.out.println(" Sắp xếp tăng dần" + integers );

        Collections.sort(integers, Collections.reverseOrder());
        System.out.println(" Sắp xêp giảm dần" + integers);
    }
}
