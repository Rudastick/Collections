package pl.kurs.list.homework06.services.homework07.app;

import pl.kurs.list.homework06.services.homework07.model.*;
import pl.kurs.list.homework07.model.*;

public class QueueRunner {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(new Cosmetic("Płyn do mycia twarzy",14.99));
        shoppingCart.addProduct(new FoodProduct("Bulka",2.00));
        shoppingCart.addProduct(new HomeChemicals("Płyn do mycia szyb",6.00));
        shoppingCart.addProduct(new Tools("Wiertarka",209.99));

        System.out.println(shoppingCart);

        shoppingCart.takeProduct();

        System.out.println(shoppingCart);
    }
}
