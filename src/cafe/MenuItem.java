package cafe;

public class MenuItem {
    int id;
    String itemName;
    boolean available;
    float price;

    public MenuItem(int id, String itemName, boolean available, float price) {
        this.id = id;
        this.itemName = itemName;
        this.available = available;
        this.price = price;
    }
}
