package main.test;

import bai7.DiemTBSinhVien;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestDiemTBSinhVien {
    @Test
    public void testDiemTB(){
        List<Double> diems = new ArrayList<>(List.of(7.5, 8.5, 4.0, 9.0));
        double expected = 7.25;
        double actual = DiemTBSinhVien.diemTB(diems);
        Assert.assertEquals(actual,expected);

        List<Double> diems2;
        diems2 = new ArrayList<>(List.of(7.0, 9.0, 8.0, 9.0, 8.0));
        double expected2 = 8.2;
        double actual2 = DiemTBSinhVien.diemTB(diems2);
        Assert.assertEquals(actual2,expected2);

    }
}
