public class BeefMeatballPizzaDecorator extends PizzaDecorator
{

    public BeefMeatballPizzaDecorator( Pizza pizza )
    {
        super(pizza);
    }

    public String makePizza()
    {
        return pizza.makePizza() + addMeatballs();

    }

    private String addMeatballs()
    {
        return "with Beef Meatballs added ";
    }
}