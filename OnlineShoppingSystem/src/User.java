import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private Cart cart;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    //methods to be implemented

    public void addToCart(Item item) {

    }

    public void removeFromCart(Item item) {

    }

    public void emptyCard() {

    }

    public String checkOut(String string) {

        return null;
    }

    public String browse(ArrayList<Item> items){

        return null;
    }

    public void undoLastAction() {

    }

}
