package ua.lviv.iot.GoodsForCreativity.managers;

import ua.lviv.iot.GoodsForCreativity.models.GoodsForCreativity;

import java.util.List;

public interface IGoodsWriter {
    void writeCSV(List<GoodsForCreativity> goodsList);
}
