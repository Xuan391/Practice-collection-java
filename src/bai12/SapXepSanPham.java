package bai12;

import java.util.*;

public class SapXepSanPham {
    static List<SanPham> sanPhams = new ArrayList<>();
    public static void main(String[] args){
        sanPhams.add(new SanPham("Sách","H01",8.0,new Date(2023,3,2)));
        sanPhams.add(new SanPham("Vở","H02",8.5,new Date(2023,1,4)));
        sanPhams.add(new SanPham("Bút","H03",7.0,new Date(2022,3,2)));
        sanPhams.add(new SanPham("Tẩy","H04",4.0,new Date(2023,4,2)));

        System.out.println("Sắp xếp theo tên");
        sortByName();
        showSanPhamList();

        System.out.println("Sắp xếp theo giá");
        sortByPrice();
        showSanPhamList();

        System.out.println("Săp xếp theo ngày");
        sortByDate();
        showSanPhamList();

        System.out.println("Sắp xếp theo giá và ngày");
        sortByPriceAndDate();
        showSanPhamList();

    }
    public static void sortByName(){
        Collections.sort(sanPhams,Comparator.comparing(SanPham::getName));
    }
    public static void sortByPrice(){
        Collections.sort(sanPhams, Comparator.comparing(SanPham::getPrice));
    }

    public static void sortByDate(){
        Collections.sort(sanPhams, Comparator.comparing(SanPham::getDate));
    }

    public static void sortByPriceAndDate(){
        Comparator<SanPham> priceDateComparator = Comparator.comparing(SanPham::getPrice).thenComparing(SanPham::getDate);
        Collections.sort(sanPhams,priceDateComparator);
    }

    public static void showSanPhamList(){
        for(SanPham sanPham: sanPhams){
            System.out.println(sanPham);
        }
        System.out.println();
    }

}
