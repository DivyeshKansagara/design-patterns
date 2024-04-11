package DecoratorPattern;

public class Mushroom extends Topping{

    public Mushroom(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+20;
    }
}
