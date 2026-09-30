package pizzaorder;

import java.util.Random;
import java.util.UUID;

public class Main {


    public static void main(String[] args) {


        Pizza kebabPizza = new Pizza("Kebab pizza", 129);

        System.out.println("Ordrar innan " + Order.getOrderCount());

        Order order1 = new Order(kebabPizza,"Yahya");
        Order order2 = new Order(kebabPizza,"Hadir");


        System.out.println("Ordrar efter " + Order.getOrderCount());

        order1.pay();
        order1.pay();

        System.out.println("------");

        System.out.println(order1);
        System.out.println(order2);

    }
}
