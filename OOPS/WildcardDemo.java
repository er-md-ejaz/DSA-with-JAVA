import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Base Item class
class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

// Subclass of Item
class Gadget extends Item {
    public Gadget(String name) {
        super(name);
    }
}

public class WildcardDemo {
    // Unbounded Wildcard: Print any list
    public static void printList(List<?> list) {
        System.out.println("Unbounded Wildcard List: " + list);
    }

    // Upper-Bounded Wildcard: Print lists of Item or its subclasses
    public static void printItemList(List<? extends Item> list) {
        System.out.print("Upper-Bounded Item List: ");
        for (Item item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // Lower-Bounded Wildcard: Add to lists that can hold Item or superclasses
    public static void addToItemList(List<? super Item> list, Item item) {
        list.add(item);
        System.out.println("Added " + item + " to Lower-Bounded List: " + list);
    }

    // Main method to test
    public static void main(String[] args) {
        System.out.println("=== Wildcard Demo ===");
        // Unbounded Wildcard
        List<String> stringList = Arrays.asList("Pen", "Paper");
        printList(stringList);

        // Upper-Bounded Wildcard
        List<Item> itemList = Arrays.asList(new Item("Book"), new Item("Notebook"));
        printItemList(itemList);
        List<Gadget> gadgetList = Arrays.asList(new Gadget("Phone"), new Gadget("Tablet"));
        printItemList(gadgetList);

        // Lower-Bounded Wildcard
        List<Item> items = new ArrayList<>();
        addToItemList(items, new Item("Laptop"));
        addToItemList(items, new Gadget("Smartwatch"));
    }
}