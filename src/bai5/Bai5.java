package bai5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bai5 {
    public static void main(String[] args){
        int[] nums = {2,4,1,4,6,2,5,2};
        int target = 6;

        Map<Integer, Integer> result = twoSum(nums, target);
        for (Map.Entry<Integer,Integer> i: result.entrySet()){
            System.out.println("["+i.getKey()+","+i.getValue()+"]");
        }

    }

    public static Map<Integer, Integer> twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Map <Integer, Integer> result  = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                result.put(map.get(complement), i);
            }
            map.put(nums[i], i);
        }

        return result;
    }
}
