package ua.lviv.iot.GoodsForCreativity.models;

public class PlasticineSet extends GoodsForCreativity {

    int coloursQuantity;

    String plasticineType;

    public PlasticineSet(String producerName, double price,
                         int coloursQuantity, String plasticineType) {
        super(producerName, price, true);
        this.coloursQuantity = coloursQuantity;
        this.plasticineType = plasticineType;
    }

    @Override
    public String toString() {
        return String.format("Producer name: %s, price: %f, coloursQuantity: %d, plasticine type: %s, may be dangerous: %b"
                , this.producerName, this.price, this.coloursQuantity, this.plasticineType, this.mayBeDangerous);
    }

}
