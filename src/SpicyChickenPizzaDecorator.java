public class SpicyChickenPizzaDecorator extends PizzaDecorator
{

    public SpicyChickenPizzaDecorator( Pizza pizza )

    {
        super(pizza); //super invokes the parent class(decorator)
    }

    public String makePizza()
    {
        return pizza.makePizza() + addSpicyChicken();

    }

    private String addSpicyChicken()

    {
        return "with Spicy Chicken added";
    }
}