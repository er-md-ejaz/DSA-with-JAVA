// Outer class representing the Library
public class Library {
    private String libraryName;
    private int bookCount;
    private static int totalLibraries = 0;

    // Constructor
    public Library(String libraryName, int bookCount) {
        this.libraryName = libraryName;
        this.bookCount = bookCount;
        totalLibraries++;
    }

    // Static Nested Class: Manages library statistics
    static class LibraryStats {
        private int totalBooksAcrossLibraries;

        // Constructor
        LibraryStats(int initialBooks) {
            this.totalBooksAcrossLibraries = initialBooks;
        }

        // Method to display library statistics
        void displayStats() {
            System.out.println("Total Libraries: " + totalLibraries);
            System.out.println("Total Books Across All Libraries: " + totalBooksAcrossLibraries);
        }

        // Static method to update book count
        static void updateGlobalBookCount(int additionalBooks) {
            System.out.println("Updating global book count by: " + additionalBooks);
        }
    }

    // Member Inner Class: Represents a Library Member
    class Member {
        private String memberName;
        private int memberId;

        // Constructor
        Member(String memberName, int memberId) {
            this.memberName = memberName;
            this.memberId = memberId;
        }

        // Method to borrow a book
        void borrowBook(String bookTitle) {
            if (bookCount > 0) {
                bookCount--;
                System.out.println(memberName + " (ID: " + memberId + ") borrowed '" + bookTitle 
                    + "' from " + libraryName + ". Books remaining: " + bookCount);
            } else {
                System.out.println("No books available in " + libraryName);
            }
        }

        // Method to display member details
        void displayMemberDetails() {
            System.out.println("Member: " + memberName + ", ID: " + memberId 
                + ", Library: " + libraryName);
        }
    }

    // Method containing a Local Inner Class: Manages book categories
    void manageBookCategory(String category) {
        // Local Inner Class
        class BookCategory {
            private String categoryName;
            private int categoryBookCount;

            // Constructor
            BookCategory(String categoryName, int categoryBookCount) {
                this.categoryName = categoryName;
                this.categoryBookCount = categoryBookCount;
            }

            // Method to display category details
            void displayCategoryDetails() {
                System.out.println("Category: " + categoryName + " in " + libraryName 
                    + ", Books in category: " + categoryBookCount);
                System.out.println("Total books in library: " + bookCount);
            }
        }

        // Create instance of Local Inner Class
        BookCategory categoryObj = new BookCategory(category, bookCount / 2);
        categoryObj.displayCategoryDetails();
    }

    // Interface for Anonymous Inner Class
    interface LibraryService {
        void performService(String serviceName);
    }

    // Method using Anonymous Inner Class: Provides a custom library service
    void provideService(String serviceName) {
        // Anonymous Inner Class
        LibraryService service = new LibraryService() {
            @Override
            public void performService(String serviceName) {
                System.out.println("Performing service: " + serviceName + " at " + libraryName);
                System.out.println("Current book count: " + bookCount);
            }
        };
        service.performService(serviceName);
    }

    // Main method to demonstrate all nested classes
    public static void main(String[] args) {
        // Create a library instance
        Library library = new Library("Central Library", 100);
        System.out.println("=== Library Management System ===");

        // Demonstrate Static Nested Class
        System.out.println("\n1. Static Nested Class: Library Statistics");
        LibraryStats stats = new LibraryStats(1000);
        stats.displayStats();
        LibraryStats.updateGlobalBookCount(50);

        // Demonstrate Member Inner Class
        System.out.println("\n2. Member Inner Class: Library Member");
        Library.Member member1 = library.new Member("Alice", 101);
        Library.Member member2 = library.new Member("Bob", 102);
        member1.displayMemberDetails();
        member1.borrowBook("Java Programming");
        member2.displayMemberDetails();
        member2.borrowBook("Data Structures");

        // Demonstrate Local Inner Class
        System.out.println("\n3. Local Inner Class: Book Category");
        library.manageBookCategory("Fiction");

        // Demonstrate Anonymous Inner Class
        System.out.println("\n4. Anonymous Inner Class: Library Service");
        library.provideService("Book Reservation");

        // Create another library to show static behavior
        System.out.println("\n5. Creating Another Library");
        Library library2 = new Library("Community Library", 50);
        LibraryStats stats2 = new LibraryStats(1050);
        stats2.displayStats();
    }
}