package ua.lviv.iot.GoodsForCreativity.managers;

import java.util.ArrayList;
import java.util.Set;

public interface ISearcher {
    void removeSentencesWhichEndWithSymbol(Character symbol, ArrayList<String> list, String sentence);

    String findQuestionSentences(String text);

    Set<String> findWordsWithMyLength (String txt, int size);

    Set<String> completeSearch(String txt, int size);
}