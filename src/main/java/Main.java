import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {

    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApples = new Apple(10, 50, Colour.RED);
        Apple greenApples = new Apple(8, 60, Colour.GREEN);

        Food[] products = {meat, redApples, greenApples};
        ShoppingCart shoppingCart = new ShoppingCart(products);

        System.out.println("Общая сумма товаров без скидки: "
                + shoppingCart.totalPriceWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: "
                + shoppingCart.totalPriceWithDiscount());
        System.out.println("Сумма вегетарианских продуктов без скидки: "
                + shoppingCart.veganProductsPriceWithoutDiscount());
    }
}
