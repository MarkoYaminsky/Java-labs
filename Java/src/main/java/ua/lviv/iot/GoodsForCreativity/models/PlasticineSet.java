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

    public int getColoursQuantity() {
        return coloursQuantity;
    }

    public String getPlasticineType() {
        return plasticineType;
    }

    @Override
    public String toString() {
        return String.format("Producer name: %s, price: %f, coloursQuantity: %d, plasticine type: %s, may be dangerous: %b"
                , this.producerName, this.price, this.coloursQuantity, this.plasticineType, this.mayBeDangerous);
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", coloursQuantity, plasticineType";
    }

    @Override
    public String toCSV() {
        return String.format("%s, %s, %s", super.toCSV(), getColoursQuantity(), getPlasticineType());
    }
}
