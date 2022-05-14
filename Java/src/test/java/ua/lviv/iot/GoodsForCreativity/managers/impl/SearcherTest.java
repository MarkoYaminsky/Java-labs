package ua.lviv.iot.GoodsForCreativity.managers.impl;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SearcherTest {

    Searcher searcher = new Searcher();

    @Test
    void removeSentencesWhichEndWithSymbol() {
        String sentences = "I like pizza. What about you?";
        String blank = "";
        ArrayList<String> initial = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        searcher.removeSentencesWhichEndWithSymbol('.', result, blank);
        assertEquals(initial, result);
        initial.add("What about you?");
        searcher.removeSentencesWhichEndWithSymbol('.', result, sentences);
        assertEquals(initial, result);
    }

    @Test
    void findQuestionSentences() {
        String text = "Java? Ruby. Python? JavaScript? F#! C#.";
        String result = searcher.findQuestionSentences(text);
        assertEquals("Java Python JavaScript", result);
    }

    @Test
    void findWordsWithMyLength() {
        String text = "I love love and I hate hate. Want to want? Work to work.";
        Set<String> expected = new HashSet<>();
        expected.add("love");
        expected.add("hate");
        expected.add("want");
        expected.add("work");
        assertEquals(expected, searcher.findWordsWithMyLength(text, 4));
    }

    @Test
    void completeSearch() {
        String text = "Do I love Java or python more? In the beginning of Java lessons I was sure that I love Python!" +
                "But now I get to love Java more and more. But what is the answer after all?" +
                "Can I find it our clearly? I don't know.";
        Set<String> expected = new HashSet<>();
        expected.add("love");
        expected.add("java");
        expected.add("what");
        expected.add("more");
        expected.add("find");
        assertEquals(expected, searcher.completeSearch(text, 4));
    }
}