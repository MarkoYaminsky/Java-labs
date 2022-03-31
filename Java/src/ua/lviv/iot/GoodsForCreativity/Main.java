package ua.lviv.iot.GoodsForCreativity;

import ua.lviv.iot.GoodsForCreativity.models.ConstructorToy;
import ua.lviv.iot.GoodsForCreativity.models.PaintsSet;
import ua.lviv.iot.GoodsForCreativity.models.PlasticineSet;

public class Main {

    public static void main(String[] args) {
        PaintsSet example1 = new PaintsSet("Scentos", 883, 24, "Aquarel");
        ConstructorToy example2 = new ConstructorToy("LEGO", 1700.0, 8, "Hospital");
        PlasticineSet example3 = new PlasticineSet("IPC", 300, 10, "classic");

        System.out.println(example1);
        System.out.println(example2);
        System.out.println(example3);
    }

}
