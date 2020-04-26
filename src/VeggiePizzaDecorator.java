public class VeggiePizzaDecorator {

    protected VeggiePizzaDecorator pizza;
    {
         public VeggiePizzaDecorator(Pizza pizza)
        {
            this.pizza = pizza;
        }

        public String veggiePizza();

        {

            return pizza.veggiePizza();
    }


}
