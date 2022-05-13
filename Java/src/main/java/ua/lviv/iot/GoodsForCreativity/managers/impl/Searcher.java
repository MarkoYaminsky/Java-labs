package ua.lviv.iot.GoodsForCreativity.managers.impl;

import ua.lviv.iot.GoodsForCreativity.managers.ISearcher;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Searcher implements ISearcher {

    @Override
    public void removeSentencesWhichEndWithSymbol(Character symbol, ArrayList<String> list, String sentences) {
        int index = sentences.lastIndexOf(symbol) + 1;
        String question = sentences.substring(index);

        if (!question.equals("")) {
            list.add(question);
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
                resultList.add(sentences);
            }
        }

        return String.join(" ", resultList);
    }

    @Override
    public Set<String> findWordsWithMyLength(String txt, int size) {
        String reg = String.format("\\b\\w{%d}\\b", size);
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(txt);
        Set<String> words = new HashSet<>();
        while (matcher.find())
            words.add(matcher.group().toLowerCase());

        return words;
    }

    @Override
    public Set<String> completeSearch(String txt, int size) {
        txt = findQuestionSentences(txt);
        return findWordsWithMyLength(txt, size);
    }

}
