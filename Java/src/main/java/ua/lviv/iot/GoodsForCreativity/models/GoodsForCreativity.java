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

    public String getProducerName() { return producerName; }

    public double getPrice() {
        return price;
    }

    public boolean getMayBeDangerous() { return mayBeDangerous; }

    public String getHeaders() {
        return "producerName, price, mayBeDangerous";
    }

    public String toCSV() {
        return String.format("%s, %s, %s", getProducerName(), getPrice(), getMayBeDangerous());
    }
}
