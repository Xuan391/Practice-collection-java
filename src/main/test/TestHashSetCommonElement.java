package main.test;

import bai14.HashSetCommonElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class TestHashSetCommonElement {
    @Test
    public void testEmptyArray(){
        int[] nums1 = {};
        int[] nums2 = {1,2,3,4,2,4};
        Set<Integer> expected = new HashSet<>();
        Set<Integer> actual = HashSetCommonElement.findCommonElement(nums1, nums2);
        Assert.assertEquals(actual,expected);

        int[] nums12 = {1,2,3,4,2,4};
        int[] nums22 = {};
        Set<Integer> expected2 = new HashSet<>();
        Set<Integer> actual2 = HashSetCommonElement.findCommonElement(nums12, nums22);
        Assert.assertEquals(actual2,expected2);

        int[] nums13 = {};
        int[] nums23 = {};
        Set<Integer> expected3 = new HashSet<>();
        Set<Integer> actual3 = HashSetCommonElement.findCommonElement(nums13, nums23);
        Assert.assertEquals(actual3,expected3);
    }
    @Test
    public void testManyElements(){

        int[] nums1 = {9,8,6};
        int[] nums2 = {1,2,3,4,2,4};
        Set<Integer> expected = new HashSet<>();
        Set<Integer> actual = HashSetCommonElement.findCommonElement(nums1, nums2);
        Assert.assertEquals(actual,expected);

        int[] nums12 = {1,2,3,4,2,4};
        int[] nums22 = {5,2,7,8,1};
        Set<Integer> expected2 = new HashSet<>();
        expected2.add(1);
        expected2.add(2);
        Set<Integer> actual2 = HashSetCommonElement.findCommonElement(nums12, nums22);
        Assert.assertEquals(actual2,expected2);

        int[] nums13 = {6,7,8,9,4,9,4};
        int[] nums23 = {7,5,8,4,9};
        Set<Integer> expected3 = new HashSet<>();
        expected3.add(7);
        expected3.add(4);
        expected3.add(8);
        expected3.add(9);
        Set<Integer> actual3 = HashSetCommonElement.findCommonElement(nums13, nums23);
        Assert.assertEquals(actual3,expected3);

    }
}
