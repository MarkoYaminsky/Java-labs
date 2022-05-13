package ua.lviv.iot.GoodsForCreativity;

import ua.lviv.iot.GoodsForCreativity.managers.impl.GoodsManager;
import ua.lviv.iot.GoodsForCreativity.managers.impl.GoodsWriter;
import ua.lviv.iot.GoodsForCreativity.managers.impl.Searcher;
import ua.lviv.iot.GoodsForCreativity.models.ConstructorToy;
import ua.lviv.iot.GoodsForCreativity.models.GoodsForCreativity;
import ua.lviv.iot.GoodsForCreativity.models.PaintsSet;
import ua.lviv.iot.GoodsForCreativity.models.PlasticineSet;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        PaintsSet scentosAquarelle = new PaintsSet("Scentos", 883, 24, "Watercolor");
        ConstructorToy legoHospital = new ConstructorToy("LEGO", 1700.0, 8, "Hospital");
        PlasticineSet ipcClassic = new PlasticineSet("IPC", 300, 10, "classic");

        System.out.println(scentosAquarelle);
        System.out.println(legoHospital);
        System.out.println(ipcClassic);

        GoodsManager rozetka = new GoodsManager();
        List<GoodsForCreativity> goodsList = new ArrayList<>();

        rozetka.addGood(scentosAquarelle, goodsList);
        rozetka.addGood(legoHospital, goodsList);
        rozetka.addGood(ipcClassic, goodsList);

        System.out.println(rozetka.sortGoodByPrice(goodsList));
        System.out.println(rozetka.sortGoodByProducerName(goodsList));
        System.out.println(rozetka.sortGoodByPriceReversed(goodsList));
        System.out.println(rozetka.sortGoodByProducerNameReversed(goodsList));

        String text = "Do I love Java or python more? In the beginning of Java lessons I was sure that I love Python!" +
                "But now I get to love Java more and more. But what is the answer after all?" +
                "Can I find it our clearly? I don't know.";
        Searcher searcher = new Searcher();
        System.out.println(searcher.completeSearch(text, 4));

    }

}
