package DecoratorPattern;

public class ExtraCheeze extends Topping{

    public ExtraCheeze(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+20;
    }
}
