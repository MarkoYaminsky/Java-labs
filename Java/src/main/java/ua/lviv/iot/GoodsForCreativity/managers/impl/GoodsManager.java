package ua.lviv.iot.GoodsForCreativity.managers.impl;

import ua.lviv.iot.GoodsForCreativity.managers.IGoodsManager;
import ua.lviv.iot.GoodsForCreativity.models.GoodsForCreativity;

import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class GoodsManager implements IGoodsManager {
    @Override
    public void addGood(GoodsForCreativity good, List<GoodsForCreativity> goodsList) {
        goodsList.add(good);
    }

    @Override
    public List<GoodsForCreativity> sortGoodByProducerName(List<GoodsForCreativity> goodsList) {
        return goodsList.stream()
                .sorted(Comparator.comparing(GoodsForCreativity::getProducerName))
                .collect(Collectors.toList());
    }

    @Override
    public List<GoodsForCreativity> sortGoodByProducerNameReversed(List<GoodsForCreativity> goodsList) {
        return goodsList.stream()
                .sorted(Comparator.comparing(GoodsForCreativity::getProducerName).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public List<GoodsForCreativity> sortGoodByPrice(List<GoodsForCreativity> goodsList) {
        return goodsList.stream()
                .sorted(Comparator.comparing(GoodsForCreativity::getPrice))
                .collect(Collectors.toList());
    }

    @Override
    public List<GoodsForCreativity> sortGoodByPriceReversed(List<GoodsForCreativity> goodsList) {
        return goodsList.stream()
                .sorted(Comparator.comparing(GoodsForCreativity::getPrice).reversed())
                .collect(Collectors.toList());
    }
}