package bai7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiemTBSinhVien {
    public static void main(String[] args){
        HashMap<String, List<Double>> sinhVienList = new HashMap<>();
        sinhVienList.put("Hong", List.of(5.0,5.0,8.0,9.0));
        sinhVienList.put("Nhung", List.of(7.0,8.0,9.0,4.0));
        sinhVienList.put("Hanh", List.of(8.0,6.0,7.0,6.0));
        for(Map.Entry<String,List<Double>> sinhvien: sinhVienList.entrySet()){
            String sinhVienName = sinhvien.getKey();
            List<Double> diems = sinhvien.getValue();
            double TB = diemTB(diems);
            System.out.println(sinhVienName + " co diem trung binh la: "+ TB);
        }
    }
    public static double diemTB (List<Double> diems){
        double sum = 0;
        double TB = 0;

        for(double diem : diems){
            sum += diem;
        }
        TB = sum/diems.size();
        return TB;
    }
}
