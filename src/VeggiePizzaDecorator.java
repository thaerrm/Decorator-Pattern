public class VeggiePizzaDecorator {

    protected VeggiePizzaDecorator pizza;
    {
        public VeggiePizzaDecorator(Pizza pizza)
        {
            this.pizza = pizza;
        }

        public String makeVeggiePizza();

        {

            return pizza.makeVeggiePizza();
    }


}
