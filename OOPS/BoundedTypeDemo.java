// Base Product class
class Product {
    private double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Price: $" + price;
    }
}

// Generic Class with Bounded Type Parameter
class PriceCalculator<T extends Product> {
    private T product;

    public PriceCalculator(T product) {
        this.product = product;
    }

    public double applyDiscount(double discountPercentage) {
        double originalPrice = product.getPrice();
        return originalPrice * (1 - discountPercentage / 100);
    }

    public void display() {
        System.out.println("Product: " + product + ", Discounted Price: $" + applyDiscount(10));
    }

    // Main method to test
    public static void main(String[] args) {
        System.out.println("=== Bounded Type Parameter Demo ===");
        // Product with price
        Product laptop = new Product(999.99);
        PriceCalculator<Product> laptopCalc = new PriceCalculator<>(laptop);
        laptopCalc.display();
        // Another product
        Product phone = new Product(499.99);
        PriceCalculator<Product> phoneCalc = new PriceCalculator<>(phone);
        phoneCalc.display();
    }
}