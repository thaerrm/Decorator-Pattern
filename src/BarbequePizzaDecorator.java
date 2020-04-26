public class BarbequePizzaDecorator extends PizzaDecorator
{

    public BarbequePizzaDecorator( Pizza pizza )

    {
        super(pizza); //invokes the parent class
    }

    public String makePizza()
    {
        return pizza.makePizza() + addBarbeque();

    }

    private String addBarbeque()
    {
        return "with Barbeque sauce added ";
    }
}