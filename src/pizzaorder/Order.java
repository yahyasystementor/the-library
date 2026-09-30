package pizzaorder;

public class Order {

    public static final int DELIVERY_FEE = 49;
    private static int orderCount = 0;


    private int id;
    private Pizza pizza;
    private String customer;
    private OrderStatus status;



    public Order(Pizza pizza, String customer) {
        orderCount++;
        this.id = orderCount;
        this.pizza = pizza;
        this.customer = customer;
        this.status = OrderStatus.NEW;
    }

    public static int getOrderCount(){
        return orderCount;
    }


    public void pay() {
        if (status != OrderStatus.NEW) {
            System.out.println("Order: " + id + " är redan betald");
            return;
        }
        status = OrderStatus.PAID;
        System.out.println("Order: " + id + " är betald");
    }

    public int getTotal() {
        return pizza.getPrice() + DELIVERY_FEE;
    }

    public String toString() {
        return "Order " + id + ": " + pizza + " till " + customer + " " + status + " " + getTotal() + "kr";
    }


}
