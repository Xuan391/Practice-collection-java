package main.test;

import bai5.IndexTwoNumbersSumEqualTarget;
import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class TestIndexTwoNumbersSumEqualTarget {
//    @Test
//    public void testTwoSum(){
//        int[] numbers= {};
//        int sum = 6;
//        Map<Integer, Integer> expected = {};
//    }


    @Test
    void testTwoSum() {
        int[] nums = {2, 4, 1, 4, 6, 2, 5, 2};
        int target = 6;

        Map<Integer, Integer> result = IndexTwoNumbersSumEqualTarget.twoSum(nums, target);

        Assert.assertEquals(result.size(),5 );
        Assert.assertTrue(result.containsKey(1));
        Assert.assertTrue(result.containsKey(3));
        Assert.assertTrue(result.containsKey(5));
        Assert.assertTrue(result.containsKey(7));

        Assert.assertEquals(result.get(1),0 );
        Assert.assertEquals(result.get(3),0 );
        Assert.assertEquals(result.get(5), 3);
    }
}
