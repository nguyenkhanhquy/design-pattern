import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void checkout(PaymentStrategy paymentStrategy) {
        int totalAmount = calculateTotal();
        paymentStrategy.pay(totalAmount);
    }

    private int calculateTotal() {
        int total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

}
