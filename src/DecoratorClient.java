public class DecoratorClient
{

    public static void main( String args[] ) {
        PlainPizza plainPizzaObj = new PlainPizza();
        String plainPizza = plainPizzaObj.makePizza();
        System.out.println(plainPizza);

        String chickenPizza = new ChickenPizzaDecorator(plainPizzaObj).makePizza();
        System.out.println("\n'" + chickenPizza + "' using ChickenPizzaDecorator");

        String vegPizza = new VeggiePizzaDecorator(plainPizzaObj).makePizza();
        System.out.println("\n'" + veggiePizza + "' using VeggiePizzaDecorator");

    }

}




