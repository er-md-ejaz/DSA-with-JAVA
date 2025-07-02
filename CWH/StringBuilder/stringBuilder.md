# StringBuilder in Java

## 🚀 What is StringBuilder?

`StringBuilder` is a class in Java used to create **mutable (changeable)** sequences of characters. Unlike `String`, which is immutable, `StringBuilder` can be modified without creating new objects every time.

---

## 🧠 Why Use StringBuilder?

- More efficient than `String` when performing many string modifications.
- Reduces memory usage by avoiding unnecessary object creation.
- Offers several methods to manipulate strings like `append()`, `insert()`, `delete()`, `replace()`, and `reverse()`.

---

## 🧪 Common Methods

| Method                         | Description                              |
|-------------------------------|------------------------------------------|
| `append(String str)`          | Adds text to the end                     |
| `insert(int offset, String)`  | Inserts text at specified index          |
| `delete(int start, int end)`  | Removes characters between indices       |
| `replace(int start, int end, String)` | Replaces characters between indices |
| `reverse()`                   | Reverses the sequence                    |
| `toString()`                  | Converts to immutable `String`           |
| `length()`                    | Returns current length                   |
| `capacity()`                  | Returns current buffer size              |

---

## ✅ Example Usage

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
sb.insert(5, ",");
sb.replace(0, 5, "Hi");
sb.delete(2, 3);
sb.reverse();
System.out.println(sb.toString()); // Output: "dlroW iH"
