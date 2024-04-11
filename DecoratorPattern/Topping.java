package DecoratorPattern;

public abstract class Topping extends BasePizza {
    final BasePizza basePizza;

    protected Topping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
}
