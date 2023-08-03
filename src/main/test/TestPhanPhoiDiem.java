package main.test;

import bai10.PhanPhoiDiem;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class TestPhanPhoiDiem {
    @Test
    void testGetScoreCountWithEmptyMap() {
        Map<Double, Integer> scoreMap = new HashMap<>();
        double minScore = 0.0;
        double maxScore = 100.0;
        int expected = 0;
        int actual = PhanPhoiDiem.getScoreCount(scoreMap,minScore,maxScore);
        Assert.assertEquals(actual,expected);
    }

    @Test
    void testGetScoreCountWithNonEmptyMap() {
        Map<Double, Integer> scoreMap = new HashMap<>();
        scoreMap.put(5.0, 3);
        scoreMap.put(7.0, 5);
        scoreMap.put(6.0, 2);
        double minScore = 5;
        double maxScore = 8;
        int expectedCount = 10;
        int result = PhanPhoiDiem.getScoreCount(scoreMap, minScore, maxScore);
        Assert.assertEquals(result, expectedCount);
    }

    @Test
    void testGetScoreCountWithMinScoreEqualToMaxScore() {
        Map<Double, Integer> scoreMap = new HashMap<>();
        scoreMap.put(8.0, 3);
        scoreMap.put(9.0, 5);
        scoreMap.put(9.5, 2);
        double minScore = 8;
        double maxScore = 10;
        int expectedCount = 10;

        int result = PhanPhoiDiem.getScoreCount(scoreMap, minScore, maxScore);

        Assert.assertEquals(result, expectedCount);
    }

    @Test
    void testGetScoreCountWithNoMatchingScores() {
        Map<Double, Integer> scoreMap = new HashMap<>();
        scoreMap.put(0.0, 3);
        scoreMap.put(1.0, 5);
        scoreMap.put(4.0, 2);
        double minScore = 0;
        double maxScore = 5;
        int expectedCount = 10;

        int result = PhanPhoiDiem.getScoreCount(scoreMap, minScore, maxScore);

        Assert.assertEquals( result, expectedCount);
    }
    @Test
    void testGetScoreCountWithScores() {
        Map<Double, Integer> scoreMap = new HashMap<>();
        scoreMap.put(10.0, 3);
        scoreMap.put(9.0, 3);
        scoreMap.put(8.02, 3);
        scoreMap.put(1.0, 5);
        scoreMap.put(4.0, 2);
        double minScore = 8;
        double maxScore = 100;
        int expectedCount = 9;

        int result = PhanPhoiDiem.getScoreCount(scoreMap, minScore, maxScore);

        Assert.assertEquals( result, expectedCount);
    }

    @Test
    void testGetScoreCountWithNegativeScores() {
        Map<Double, Integer> scoreMap = new HashMap<>();
        scoreMap.put(-1.0, 3);
        scoreMap.put(0.0, 5);
        scoreMap.put(0.0, 2);
        double minScore = 0.0;
        double maxScore = 9.0;
        Assert.assertThrows(IllegalArgumentException.class, () -> PhanPhoiDiem.getScoreCount(scoreMap, minScore, maxScore));
    }

    @Test
    void testGetScoreCountWithThan10Scores() {
        Map<Double, Integer> scoreMap = new HashMap<>();
        scoreMap.put(100.0, 3);
        scoreMap.put(0.0, 5);
        scoreMap.put(0.0, 2);
        double minScore = 0.0;
        double maxScore = 9.0;
        Assert.assertThrows(IllegalArgumentException.class, () -> PhanPhoiDiem.getScoreCount(scoreMap, minScore, maxScore));
    }
}
