public class ChickenPizzaDecorator extends PizzaDecorator
{

    public ChickenPizzaDecorator( Pizza pizza )
    {
        super(pizza);
    }

    public String makePizza()
    {
        return pizza.makePizza() + addChicken();

    }

    private String addChicken()
    {
        return "with Chicken added";
    }
}