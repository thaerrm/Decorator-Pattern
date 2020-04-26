public class BeefMeatballPizzaDecorator extends PizzaDecorator
{

    public BeefMeatballPizzaDecorator( Pizza pizza )

    {
        super(pizza); //super invokes the parent class
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