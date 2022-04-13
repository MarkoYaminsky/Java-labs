package ua.lviv.iot.GoodsForCreativity.managers;

import ua.lviv.iot.GoodsForCreativity.models.GoodsForCreativity;

import java.util.List;

public interface IGoodsManager {
    void addGood(GoodsForCreativity good);

    List<GoodsForCreativity> findGoodByProducerName();

    List<GoodsForCreativity> findGoodByPrice();
}