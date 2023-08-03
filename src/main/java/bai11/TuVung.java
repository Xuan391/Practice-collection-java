package bai11;

import java.util.HashMap;
import java.util.Scanner;

public class TuVung {
    public static HashMap<String, String> tuDiens = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        int choice;
        do{
            System.out.println("1. Thêm từ vựng ");
            System.out.println("2. Tra cứu");
            System.out.println("3. Exit");
            System.out.println("Bạn chọn: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Thêm từ vựng");
                    addTuVung();
                    break;
                case 2:
                    System.out.println("Tra cứu");
                    findTuVung();
                    break;
                case 3:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }while (choice != 3);

        scanner.close();
    }

    public static void addTuVung(){
        System.out.println("Nhâp từ vựng: ");
        scanner.nextLine();
        String key = scanner.nextLine();
        System.out.println("Ý nghĩa: ");
        String value = scanner.nextLine();

        if(tuDiens.containsKey(key)){
            System.out.println("Từ vựng đã có trong từ điển");
        } else {
            tuDiens.put(key, value);
            System.out.println("Thêm từ vựng thành công");
        }
    }
    public static void findTuVung(){
        System.out.println("Tìm kiếm: ");
        scanner.nextLine();
        String key = scanner.nextLine();

        if(tuDiens.containsKey(key)){
            System.out.println(key + " : " + tuDiens.get(key));
        } else {
            System.out.println("not found");
        }
    }
}
