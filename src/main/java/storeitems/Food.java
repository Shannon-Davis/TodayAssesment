package storeitems;

public abstract class Food extends Product implements IConsumable, IEdible {
    public Food(String name, Double price) {
        super(name, price);
    }

    @Override
    public Integer consume() {
        return 0;
    }
}
