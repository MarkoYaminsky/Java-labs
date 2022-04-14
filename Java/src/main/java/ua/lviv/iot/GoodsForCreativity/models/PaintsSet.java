package ua.lviv.iot.GoodsForCreativity.models;

public class PaintsSet extends GoodsForCreativity {

    int paintsQuantity;

    String paintsType;

    public PaintsSet(String producerName, double price, int paintsQuantity, String paintsType) {
        super(producerName, price, true);
        this.paintsQuantity = paintsQuantity;
        this.paintsType = paintsType;
    }

    @Override
    public String toString() {
        return String.format("Producer name: %s, price: %f, paintsQuantity: %d, paints type: %s, may be dangerous: %b"
                , this.producerName, this.price, this.paintsQuantity, this.paintsType, this.mayBeDangerous);
    }

}
