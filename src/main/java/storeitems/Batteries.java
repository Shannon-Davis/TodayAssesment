package storeitems;

public class Batteries extends Product implements IConsumable {
    public Batteries(String name, Double price) {
        super(name, price);
    }

    @Override
    public Integer consume() {
        return null;
    }
}
