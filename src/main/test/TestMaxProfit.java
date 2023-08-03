package main.test;

import bai6.MaxProfit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMaxProfit {
    @Test
    public void testMaxProfit(){
        int[] nums = {9,2,5,3,7,3};
        int expected = 5;
        int actual = MaxProfit.maxProfit(nums);
        Assert.assertEquals(actual, expected);

        int[] nums1 = {9,7,6,5,4,3};
        int expected1 = 0;
        int actual1 = MaxProfit.maxProfit(nums1);
        Assert.assertEquals(actual1, expected1);

        int[] nums2 = {9,7,6,5,4,5};
        int expected2 = 1;
        int actual2 = MaxProfit.maxProfit(nums2);
        Assert.assertEquals(actual2, expected2);

        int[] nums3 = {2,3,4,5,6,7};
        int expected3 = 5;
        int actual3 = MaxProfit.maxProfit(nums3);
        Assert.assertEquals(actual3, expected3);

        int[] nums4 = {11,12,3,4,6,5,12,7};
        int expected4 = 9;
        int actual4 = MaxProfit.maxProfit(nums4);
        Assert.assertEquals(actual4, expected4);

        int[] nums5 = {13,12,4,6,3,8,4};
        int expected5 = 5;
        int actual5 = MaxProfit.maxProfit(nums5);
        Assert.assertEquals(actual5, expected5);
    }
}
