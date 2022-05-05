package ua.lviv.iot.GoodsForCreativity.managers;

import ua.lviv.iot.GoodsForCreativity.models.GoodsForCreativity;

import java.util.List;

public interface IGoodsManager {
    void addGood(GoodsForCreativity good, List<GoodsForCreativity> goodsList);

    List<GoodsForCreativity> sortGoodByProducerName(List<GoodsForCreativity> goodsList);

    List<GoodsForCreativity> sortGoodByPrice(List<GoodsForCreativity> goodsList);

    List<GoodsForCreativity> sortGoodByProducerNameReversed(List<GoodsForCreativity> goodsList);

    List<GoodsForCreativity> sortGoodByPriceReversed(List<GoodsForCreativity> goodsList);
}