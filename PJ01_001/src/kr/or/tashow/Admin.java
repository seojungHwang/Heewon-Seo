package kr.or.tashow;

public class Admin {
    private String id;
    private BikeType bikeType;
    private int price;
    private int countSingle;
    private int countTwin;

    public Admin() {
    }

    public Admin(String id, BikeType bikeType, int price, int countSingle, int countTwin) {
        this.id = id;
        this.bikeType = bikeType;
        this.price = price;
        this.countSingle = countSingle;
        this.countTwin = countTwin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BikeType getBikeType() {
        return bikeType;
    }

    public void setBikeType(BikeType bikeType) {
        this.bikeType = bikeType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCountSingle() {
        return countSingle;
    }

    public void setCountSingle(int countSingle) {
        this.countSingle = countSingle;
    }

    public int getCountTwin() {
        return countTwin;
    }

    public void setCountTwin(int countTwin) {
        this.countTwin = countTwin;
    }
}
