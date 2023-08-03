package main.test;

import bai9.CountWordText;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class TestCountWordText {
    @Test
    public void testEmptyText() {
        String text = "";
        HashMap<String, Integer> expected = new HashMap<>();
        HashMap<String, Integer> actual = CountWordText.countWords(text);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSingleWord() {
        String text = "hello";
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("hello", 1);
        HashMap<String, Integer> actual = CountWordText.countWords(text);
        Assert.assertEquals( actual, expected);
    }

    @Test
    public void testMultipleWords() {
        String text = "hello world hello";
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        HashMap<String, Integer> actual = CountWordText.countWords(text);
        Assert.assertEquals( actual, expected);
    }

    @Test
    public void testCaseInsensitive() {
        String text = "Hello hello hELLo";
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("hello", 3);
        HashMap<String, Integer> actual = CountWordText.countWords(text);
        Assert.assertEquals( actual, expected);
    }

    @Test
    public void testWordsWithPunctuation() {
        String text = "hello, world! hello?";
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        HashMap<String, Integer> actual = CountWordText.countWords(text);
        Assert.assertEquals( actual, expected);
    }

    @Test
    public void testWordsWithWhitespace() {
        String text = "hello   world hello";
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        HashMap<String, Integer> actual = CountWordText.countWords(text);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testLongText() {
        String text = "this is a long text with many words and repeated words. long text.";
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("this", 1);
        expected.put("is", 1);
        expected.put("a", 1);
        expected.put("long", 2);
        expected.put("text", 2);
        expected.put("with", 1);
        expected.put("many", 1);
        expected.put("words", 2);
        expected.put("and", 1);
        expected.put("repeated", 1);
        HashMap<String, Integer> actual = CountWordText.countWords(text);
        Assert.assertEquals( actual, expected);
    }

    @Test
    public void testTextWithNumbers() {
        String text = "hello 123 world 456";
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("hello", 1);
        expected.put("world", 1);
        expected.put("123", 1);
        expected.put("456", 1);
        HashMap<String, Integer> actual = CountWordText.countWords(text);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testTextWithSpecialCharacters() {
        String text = "hello!@# world #$% hello";
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        HashMap<String, Integer> actual = CountWordText.countWords(text);
        Assert.assertEquals( actual, expected);
    }

    @Test
    public void testTextWithEmptyWords() {
        String text = "hello  world    hello";
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        HashMap<String, Integer> actual = CountWordText.countWords(text);
        Assert.assertEquals( actual, expected);
    }
}
