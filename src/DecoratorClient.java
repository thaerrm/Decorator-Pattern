public class DecoratorClient
{

    public static void main(String[] args) {

        PlainPizza plainPizzaObj = new PlainPizza(); //obj cos specific obj being redefined as such below in each of the modules..overriden

        String plainPizza = plainPizzaObj.makePizza();
        System.out.println(plainPizza);

        String beefMeatballPizza = new BeefMeatballPizzaDecorator(plainPizzaObj).makePizza();
        System.out.println( beefMeatballPizza + " using the BeefMeatballPizzaDecorator."); // next output

        String spicyChickenPizza = new SpicyChickenPizzaDecorator(plainPizzaObj).makePizza();
        System.out.println( spicyChickenPizza + " using the SpicyChickenPizzaDecorator.");  //next output

        String barbequePizza = new BarbequePizzaDecorator(plainPizzaObj).makePizza();
        System.out.println( barbequePizza + " using the BarbequePizzaDecorator. "); //next output

    }

}




