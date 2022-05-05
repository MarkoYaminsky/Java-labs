package ua.lviv.iot.GoodsForCreativity.managers.impl;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.GoodsForCreativity.models.ConstructorToy;
import ua.lviv.iot.GoodsForCreativity.models.GoodsForCreativity;
import ua.lviv.iot.GoodsForCreativity.models.PaintsSet;
import ua.lviv.iot.GoodsForCreativity.models.PlasticineSet;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GoodsManagerTest {
    private final GoodsManager goodsManager = new GoodsManager();
    private List<GoodsForCreativity> goodsList = new ArrayList<>();
    private final PaintsSet scentosAquarelle = new PaintsSet("Scentos", 883, 24, "Watercolor");
    private final ConstructorToy legoHospital = new ConstructorToy("LEGO", 1700.0, 8, "Hospital");
    private final PlasticineSet ipcClassic = new PlasticineSet("IPC", 300, 10, "classic");

    @Test
    public void sizeOfListWithNewElementAdded() {
        int sizeOfList = goodsList.size();
        goodsManager.addGood(scentosAquarelle, goodsList);
        assertEquals(sizeOfList + 1, goodsList.size());
    }

    @Test
    public void sortOrderByProducerName() {
        goodsList.add(scentosAquarelle);
        goodsList.add(ipcClassic);
        goodsList.add(legoHospital);
        goodsList = goodsManager.sortGoodByProducerName(goodsList);
        goodsManager.sortGoodByProducerName(goodsList);
        assertEquals(goodsList.stream()
                .sorted(Comparator.comparing(GoodsForCreativity::getProducerName))
                .collect(Collectors.toList()), goodsList);
    }

    @Test
    public void sortOrderByProducerNameReversed() {
        goodsList.add(scentosAquarelle);
        goodsList.add(ipcClassic);
        goodsList.add(legoHospital);
        goodsList = goodsManager.sortGoodByProducerNameReversed(goodsList);
        goodsManager.sortGoodByProducerNameReversed(goodsList);
        assertEquals(goodsList.stream()
                .sorted(Comparator.comparing(GoodsForCreativity::getProducerName).reversed())
                .collect(Collectors.toList()), goodsList);
    }

    @Test
    public void sortOrderByPrice() {
        goodsList.add(scentosAquarelle);
        goodsList.add(ipcClassic);
        goodsList.add(legoHospital);
        goodsList = goodsManager.sortGoodByPrice(goodsList);
        goodsManager.sortGoodByProducerName(goodsList);
        assertEquals(goodsList.stream()
                .sorted(Comparator.comparing(GoodsForCreativity::getPrice))
                .collect(Collectors.toList()), goodsList);
    }

    @Test
    public void sortOrderByPriceReversed() {
        goodsList.add(scentosAquarelle);
        goodsList.add(ipcClassic);
        goodsList.add(legoHospital);
        goodsList = goodsManager.sortGoodByPriceReversed(goodsList);
        goodsManager.sortGoodByProducerName(goodsList);
        assertEquals(goodsList.stream()
                .sorted(Comparator.comparing(GoodsForCreativity::getPrice).reversed())
                .collect(Collectors.toList()), goodsList);
    }
}