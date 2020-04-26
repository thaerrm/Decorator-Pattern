abstract class PizzaDecorator implements Pizza //base for the subclasses
{
    protected Pizza pizza;  //allows access from bbq, chicken, beefmeatball class

    public PizzaDecorator(Pizza pizza) //the interface
    {
        this.pizza = pizza;
    }

    public String makePizza()
    {
        return pizza.makePizza();
    }

    }
