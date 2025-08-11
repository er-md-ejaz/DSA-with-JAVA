// Generic Interface
interface ItemHolder<T> {
    void hold(T item);
    T getHeldItem();
}

// Generic Class implementing Generic Interface
class Holder<T> implements ItemHolder<T> {
    private T item;

    @Override
    public void hold(T item) {
        this.item = item;
    }

    @Override
    public T getHeldItem() {
        return item;
    }

    public void display() {
        System.out.println("Held item: " + item);
    }

    // Main method to test
    public static void main(String[] args) {
        System.out.println("=== Generic Interface Demo ===");
        // Hold a String
        Holder<String> stringHolder = new Holder<>();
        stringHolder.hold("Smartphone");
        stringHolder.display();
        // Hold an Integer
        Holder<Integer> intHolder = new Holder<>();
        intHolder.hold(499);
        intHolder.display();
    }
}