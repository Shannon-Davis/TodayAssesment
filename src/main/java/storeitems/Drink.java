package storeitems;

public abstract class Drink extends Product implements IConsumable {
    public Drink(String name, Double price) {
        super(name, price);
    }
}
