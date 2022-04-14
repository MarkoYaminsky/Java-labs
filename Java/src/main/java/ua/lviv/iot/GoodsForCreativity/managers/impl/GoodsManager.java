package ua.lviv.iot.GoodsForCreativity.managers.impl;

import ua.lviv.iot.GoodsForCreativity.managers.IGoodsManager;
import ua.lviv.iot.GoodsForCreativity.models.GoodsForCreativity;

import java.util.List;
import java.util.LinkedList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class GoodsManager implements IGoodsManager {
    private final List<GoodsForCreativity> goodsList = new LinkedList<>();

    @Override
    public void addGood(GoodsForCreativity GoodsForCreativity) {
        goodsList.add(GoodsForCreativity);
    }

    @Override
    public List<GoodsForCreativity> findGoodByProducerName() {
        return goodsList.stream()
                .sorted(Comparator.comparing(GoodsForCreativity::getProducerName).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public List<GoodsForCreativity> findGoodByPrice() {
        return goodsList.stream()
                .sorted(Comparator.comparing(GoodsForCreativity::getPrice).reversed())
                .collect(Collectors.toList());
    }
}