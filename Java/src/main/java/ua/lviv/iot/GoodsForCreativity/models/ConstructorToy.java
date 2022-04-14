package ua.lviv.iot.GoodsForCreativity.models;

public class ConstructorToy extends GoodsForCreativity {

    int difficultyRating;

    String constructionType;

    public ConstructorToy(String producerName, double price,
                          int difficultyRating, String constructionType) {
        super(producerName, price, false);
        this.difficultyRating = difficultyRating;
        this.constructionType = constructionType;
    }

    @Override
    public String toString() {
        return String.format("Producer name: %s, price: %f, difficulty rating: %d, construction type: %s, may be dangerous: %b"
        , this.producerName, this.price, this.difficultyRating, this.constructionType, this.mayBeDangerous);
    }

}
