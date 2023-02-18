package Encapsulation;
public class Products {
    private String name;
    private int price;
    public Products(String name, int price) {
        this.name = name;
        if(price<0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        if(price<0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

}
