package ua.lviv.iot.GoodsForCreativity.models;

public abstract class GoodsForCreativity {

    String producerName;

    double price;

    boolean mayBeDangerous;

    GoodsForCreativity(String producerName, double price, boolean mayBeDangerous) {
        this.producerName = producerName;
        this.price = price;
        this.mayBeDangerous = mayBeDangerous;
    }

}
