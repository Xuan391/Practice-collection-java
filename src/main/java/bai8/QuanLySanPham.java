package bai8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuanLySanPham {
    public static HashMap<String,SanPham> sanPhamList = new HashMap<>();
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Thêm sản phẩm mới vào danh sách");
            System.out.println("2. Hiển thị danh sách tất cả các sản phẩm");
            System.out.println("3. Tìm thông tin sản phẩm dựa trên mã sản phẩm");
            System.out.println("4. Xóa sản phẩm khỏi danh sách dựa trên mã sản phẩm");
            System.out.println("5. Cập nhật thông tin sản phẩm dựa trên mã sản phẩm");
            System.out.println("6. Exit");
            System.out.print("Bạn chọn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Thêm danh sản phẩm");
                    System.out.println(addSanPham());
                    break;
                case 2:
                    System.out.println("Danh sách sản phẩm");
                    showSanPhamList();
                    break;
                case 3:
                    System.out.println("Thông tin sản phẩm");
                    System.out.println(findSanPham());
                    break;
                case 4:
                    System.out.println("Xóa sản phẩm");
                    System.out.println(removeSanPham());
                    break;
                case 5:
                    System.out.println("Cập nhật thông tin sản phẩm");
                    System.out.println(updateSanPham());
                    break;
                case 6:
                    System.out.println("Thoát Menu");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();

        } while (choice != 6);

        sc.close();
    }

    public static String addSanPham(){

        System.out.println("Nhập mã sản phẩm: ");
        sc.nextLine();
        String key = sc.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double price = sc.nextDouble();
        System.out.println("Nhập số lượng sản phẩm: ");
        int quality = sc.nextInt();

        if(sanPhamList.containsKey(key)){
            return "Sản phẩm đã tồn tại!";
        } else {
            SanPham sanPham = new SanPham(name, price, quality);
            sanPhamList.put(key, sanPham);
            return "Thêm sản phẩm thành công";
        }
    }

    public static void showSanPhamList(){
        for (Map.Entry<String, SanPham> sanPhamEntry : sanPhamList.entrySet()){
            System.out.println(sanPhamEntry.getKey() + "---" + sanPhamEntry.getValue().toString());
        }
    }

    public static String findSanPham(){
        System.out.println("Nhập mã sản phẩm: ");
        sc.nextLine();
        String key = sc.nextLine();

        if(sanPhamList.containsKey(key)){
            SanPham sanPham = sanPhamList.get(key);
            return sanPham.toString();
        } else {
            return "không tìm thấy sản phẩm";
        }
    }

    public static String removeSanPham(){
        System.out.println("Nhập mã sản phẩm");
        sc.nextLine();
        String key = sc.nextLine();

        if(sanPhamList.containsKey(key)){
            sanPhamList.remove(key);
            return "Xóa sản phẩm thành công";
        } else{
            return "Sản phẩm không tồn tại";
        }
    }

    public static String updateSanPham(){
        System.out.println("Nhập mã sản phẩm: ");
        sc.nextLine();
        String key = sc.nextLine();

        if(sanPhamList.containsKey(key)){
            SanPham sanPham = sanPhamList.get(key);

            System.out.println("Cập nhật name: ");
            String name = sc.nextLine();
            System.out.println("Cập nhật giá: " );
            double price = sc.nextDouble();
            System.out.println("Cập nhật số lượng: ");
            int quality = sc.nextInt();

            sanPham.setName(name);
            sanPham.setPrice(price);
            sanPham.setQuality(quality);

            return "Cập nhật thành công: "+ sanPham.toString();
        } else {
            return "Không tìm thấy sản phẩm";
        }
    }
}
