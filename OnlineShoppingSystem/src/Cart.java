import java.util.ArrayList;

public class Cart {
    private int id;
    private ArrayList<Item> items;
    private PaymentStrategy paymentStrategy;

    public Cart(int id) {
        this.id = id;
        this.items = new ArrayList<Item>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    //methods to be implemented
    public void addItem(Item item) {

    }

    public void removeItem(Item item) {

    }

    public void clearItems() {

    }

    public double calculateTotal() {

        return 0;
    }

    public void pay(double total) {

    }

    public void save() {
        //cartmemento saving?
    }

    public void restore(CartMemento memento) {

    }
}
