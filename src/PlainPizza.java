public class PlainPizza implements Pizza
{

    @Override //because the Pizza method will be redefined
    public String makePizza()

    {
        return "Plain Pizza with mozarella cheese and tomato ";
    }
}