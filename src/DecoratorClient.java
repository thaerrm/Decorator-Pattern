public class DecoratorClient
{

    public static void main(String[] args) {

        PlainPizza plainPizzaObj = new PlainPizza();

        String plainPizza = plainPizzaObj.makePizza();
        System.out.println(plainPizza);

        String beefmeatballPizza = new BeefMeatballPizzaDecorator(plainPizzaObj).makePizza();
        System.out.println("\n'" + beefmeatballPizza + " using BeefMeatballPizzaDecorator");

        String chickenPizza = new ChickenPizzaDecorator(plainPizzaObj).makePizza();
        System.out.println("\n'" + chickenPizza + " using ChickenPizzaDecorator");

        String barbequePizza = new BarbequePizzaDecorator(plainPizzaObj).makePizza();
        System.out.println("\n'" + barbequePizza + " using BarbequePizzaDecorator");

    }

}




