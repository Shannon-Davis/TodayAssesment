package storeitems;

public abstract class Product {
    private String name;
    private Double price;
    protected ExpirationDate expirationDate;
    public Double discountRate;

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

     public static void printExperationDate(ExpirationDate product){


     }
}
