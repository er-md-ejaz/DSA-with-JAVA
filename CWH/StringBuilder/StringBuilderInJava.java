
public class StringBuilderInJava {
    public static void main(String[] args) {
        // Create a StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // Append text
        sb.append(" World");

        // Insert a comma at index 5
        sb.insert(5, ",");

        // Replace 'Hello' with 'Hi'
        sb.replace(0, 5, "Hi");

        // Delete the space after 'Hi'
        sb.delete(2, 3);

        // Reverse the string
        sb.reverse();

        // Convert to String and print
        String result = sb.toString();
        System.out.println("Final Result: " + result);  // Output: "dlroW,iH"
    }
}
