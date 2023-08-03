package main.test;

import bai15.ShowAllElements;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class TestShowAllElements {
    @Test
    public void testEmptyArray(){
        int[] nums1 = {};
        int[] nums2 = {};
        Set<Integer> expected = new HashSet<>();
        Set<Integer> actual = ShowAllElements.showAllElement(nums1, nums2);
        Assert.assertEquals(actual, expected);

        int[] nums12 = {};
        int[] nums22 = {1,2,3};
        Set<Integer> expected2 = new HashSet<>();
        expected2.add(1);
        expected2.add(2);
        expected2.add(3);
        Set<Integer> actual2 = ShowAllElements.showAllElement(nums12, nums22);
        Assert.assertEquals(actual2, expected2);

        int[] nums13 = {3,4,5};
        int[] nums23 = {};
        Set<Integer> expected3 = new HashSet<>();
        expected3.add(3);
        expected3.add(4);
        expected3.add(5);
        Set<Integer> actual3 = ShowAllElements.showAllElement(nums13, nums23);
        Assert.assertEquals(actual3, expected3);
    }

    @Test
    public void testManyElements(){
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {1,2,3};
        Set<Integer> expected = new HashSet<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        Set<Integer> actual = ShowAllElements.showAllElement(nums1, nums2);
        Assert.assertEquals(actual, expected);

        int[] nums12 = {3,4,5,6,7};
        int[] nums22 = {1,2,3};
        Set<Integer> expected2 = new HashSet<>();
        expected2.add(1);
        expected2.add(2);
        expected2.add(3);
        expected2.add(4);
        expected2.add(5);
        expected2.add(6);
        expected2.add(7);
        Set<Integer> actual2 = ShowAllElements.showAllElement(nums12, nums22);
        Assert.assertEquals(actual2, expected2);

        int[] nums13 = {3,4,5,5, 3, 4};
        int[] nums23 = {9, 9, 9,7, 8 ,8};
        Set<Integer> expected3 = new HashSet<>();
        expected3.add(3);
        expected3.add(4);
        expected3.add(5);
        expected3.add(7);
        expected3.add(8);
        expected3.add(9);
        Set<Integer> actual3 = ShowAllElements.showAllElement(nums13, nums23);
        Assert.assertEquals(actual3, expected3);
    }
}
