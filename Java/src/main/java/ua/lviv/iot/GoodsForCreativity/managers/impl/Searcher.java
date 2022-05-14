package ua.lviv.iot.GoodsForCreativity.managers.impl;

import ua.lviv.iot.GoodsForCreativity.managers.ISearcher;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Searcher implements ISearcher {

    @Override
    public void removeSentencesWhichEndWithSymbol(char symbol, ArrayList<String> list, String sentences) {
        int index = sentences.lastIndexOf(symbol) + 1;
        String question = sentences.substring(index);

        if (!question.equals("")) {
            list.add(question.trim());
        }
    }

    @Override
    public String findQuestionSentences(String text) {
        String[] strings = text.split("\\?");
        List<String> questionList = new ArrayList<>(Arrays.asList(strings));
        ArrayList<String> resultList = new ArrayList<>();

        for (String sentences : questionList) {
            if (sentences.contains(".")) {
                removeSentencesWhichEndWithSymbol('.', resultList, sentences);
            } else if (sentences.contains("!")) {
                removeSentencesWhichEndWithSymbol('!', resultList, sentences);
            } else if (!sentences.equals("")) {
                resultList.add(sentences.trim());
            }
        }

        return String.join(" ", resultList);
    }

    @Override
    public Set<String> findWordsWithMyLength(String text, int length) {
        String reg = String.format("\\b\\w{%d}\\b", length);
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(text);
        Set<String> words = new HashSet<>();
        while (matcher.find())
            words.add(matcher.group().toLowerCase());

        return words;
    }

    @Override
    public Set<String> completeSearch(String text, int length) {
        text = findQuestionSentences(text);
        return findWordsWithMyLength(text, length);
    }

}
