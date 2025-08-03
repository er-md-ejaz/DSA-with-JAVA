// Generic Class
public class Storage<T> {
    private T item;

    // Constructor
    public Storage(T item) {
        this.item = item;
    }

    // Getter
    public T getItem() {
        return item;
    }

    // Setter
    public void setItem(T item) {
        this.item = item;
    }

    // Display method
    public void display() {
        System.out.println("Stored item: " + item);
    }

    // Main method to test
    public static void main(String[] args) {
        System.out.println("=== Generic Class Demo ===");
        // Store a String
        Storage<String> stringStorage = new Storage<>("Laptop");
        stringStorage.display();
        // Store an Integer
        Storage<Integer> intStorage = new Storage<>(999);
        intStorage.display();
        // Store a Double
        Storage<Double> doubleStorage = new Storage<>(49.99);
        doubleStorage.display();
    }
}