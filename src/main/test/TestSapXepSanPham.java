package main.test;

import bai12.SanPham;
import bai12.SapXepSanPham;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestSapXepSanPham {
    private static List<SanPham> sanPhams;

    @Before
    public void setUp() {
        sanPhams = new ArrayList<>();
        sanPhams.add(new SanPham("Sách", "H01", 8.0, new Date(2023, 3, 2)));
        sanPhams.add(new SanPham("Vở", "H02", 8.5, new Date(2023, 1, 4)));
        sanPhams.add(new SanPham("Bút", "H03", 7.0, new Date(2022, 3, 2)));
        sanPhams.add(new SanPham("Tẩy", "H04", 4.0, new Date(2023, 4, 2)));
    }

    @Test
    public void testSortByName() {
        SapXepSanPham.sortByName();
        Assert.assertEquals("Bút", sanPhams.get(0).getName());
        Assert.assertEquals("Sách", sanPhams.get(1).getName());
        Assert.assertEquals("Tẩy", sanPhams.get(2).getName());
        Assert.assertEquals("Vở", sanPhams.get(3).getName());
    }

    @Test
    public void testSortByPrice() {
        SapXepSanPham.sortByPrice();
        Assert.assertEquals(4.0, sanPhams.get(0).getPrice(), 0.001);
        Assert.assertEquals(7.0, sanPhams.get(1).getPrice(), 0.001);
        Assert.assertEquals(8.0, sanPhams.get(2).getPrice(), 0.001);
        Assert.assertEquals(8.5, sanPhams.get(3).getPrice(), 0.001);
    }

    @Test
    public void testSortByDate() {
        SapXepSanPham.sortByDate();
        Assert.assertEquals(new Date(2022, 3, 2), sanPhams.get(0).getDate());
        Assert.assertEquals(new Date(2023, 1, 4), sanPhams.get(1).getDate());
        Assert.assertEquals(new Date(2023, 3, 2), sanPhams.get(2).getDate());
        Assert.assertEquals(new Date(2023, 4, 2), sanPhams.get(3).getDate());
    }

    @Test
    public void testSortByPriceAndDate() {
        SapXepSanPham.sortByPriceAndDate();
        Assert.assertEquals(4.0, sanPhams.get(0).getPrice(), 0.001);
        Assert.assertEquals(new Date(2022, 3, 2), sanPhams.get(0).getDate());

        Assert.assertEquals(7.0, sanPhams.get(1).getPrice(), 0.001);
        Assert.assertEquals(new Date(2023, 3, 2), sanPhams.get(1).getDate());

        Assert.assertEquals(8.0, sanPhams.get(2).getPrice(), 0.001);
        Assert.assertEquals(new Date(2023, 3, 2), sanPhams.get(2).getDate());

        Assert.assertEquals(8.5, sanPhams.get(3).getPrice(), 0.001);
        Assert.assertEquals(new Date(2023, 1, 4), sanPhams.get(3).getDate());
    }
}
