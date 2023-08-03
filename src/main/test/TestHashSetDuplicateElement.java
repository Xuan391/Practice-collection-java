package main.test;

import bai13.HashSetDuplicateElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class TestHashSetDuplicateElement {
    @Test
    public void testWithEmptyArray(){
        int[] nums = {};
        Set<Integer> expected = new HashSet<>();
        Set<Integer> actual = HashSetDuplicateElement.findDuplicateElement(nums);
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testWithOneElement(){
        int[] nums = {1};
        Set<Integer> expected = new HashSet<>();
        Set<Integer> actual = HashSetDuplicateElement.findDuplicateElement(nums);
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testWithTwoElements(){
        int[] nums = {1,2};
        Set<Integer> expected = new HashSet<>();
        Set<Integer> actual = HashSetDuplicateElement.findDuplicateElement(nums);
        Assert.assertEquals(actual, expected);

        int[] nums1 = {1,1};
        Set<Integer> expected1 = new HashSet<>();
        expected1.add(1);
        Set<Integer> actual1 = HashSetDuplicateElement.findDuplicateElement(nums1);
        Assert.assertEquals(actual1, expected1);

    }

    @Test
    public void testWithManyElements(){

        int[] nums = {1,2,1,2,3};
        Set<Integer> expected = new HashSet<>();
        expected.add(1);
        expected.add(2);
        Set<Integer> actual = HashSetDuplicateElement.findDuplicateElement(nums);
        Assert.assertEquals(actual, expected);

        int[] nums2 = {1,2,3,4,5,6};
        Set<Integer> expected2 = new HashSet<>();
        Set<Integer> actual2 = HashSetDuplicateElement.findDuplicateElement(nums2);
        Assert.assertEquals(actual2, expected2);

        int[] nums3 = {-3,-2,0,-3,1};
        Set<Integer> expected3 = new HashSet<>();
        expected3.add(-3);
        Set<Integer> actual3 = HashSetDuplicateElement.findDuplicateElement(nums3);
        Assert.assertEquals(actual3, expected3);

        int[] nums4 = {2,3,7,2,6,3,0,9,20};
        Set<Integer> expected4 = new HashSet<>();
        expected4.add(2);
        expected4.add(3);
        Set<Integer> actual4 = HashSetDuplicateElement.findDuplicateElement(nums4);
        Assert.assertEquals(actual4, expected4);

    }
}
