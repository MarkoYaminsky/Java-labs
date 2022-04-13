package ua.lviv.iot.GoodsForCreativity;

import ua.lviv.iot.GoodsForCreativity.managers.impl.GoodsManager;
import ua.lviv.iot.GoodsForCreativity.models.ConstructorToy;
import ua.lviv.iot.GoodsForCreativity.models.PaintsSet;
import ua.lviv.iot.GoodsForCreativity.models.PlasticineSet;

public class Main {

    public static void main(String[] args) {
        PaintsSet scentosAquarelle = new PaintsSet("Scentos", 883, 24, "Watercolor");
        ConstructorToy legoHospital = new ConstructorToy("LEGO", 1700.0, 8, "Hospital");
        PlasticineSet ipcClassic = new PlasticineSet("IPC", 300, 10, "classic");

        System.out.println(scentosAquarelle);
        System.out.println(legoHospital);
        System.out.println(ipcClassic);

        GoodsManager rozetka = new GoodsManager();

        rozetka.addGood(scentosAquarelle);
        rozetka.addGood(legoHospital);
        rozetka.addGood(ipcClassic);

        System.out.println(rozetka.findGoodByPrice());
        System.out.println(rozetka.findGoodByProducerName());
    }

}
