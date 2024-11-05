public class LibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975");
        Book book2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721");
        Book book3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623");

        Library library = new Library();

        library.addLibraryItems(book1);
        library.addLibraryItems(book2);
        library.addLibraryItems(book3);

        library.displayLibraryInfo();
        System.out.println(" ");
        library.listAvailableItems();
        System.out.println("\n\n------------------------------------------------------------\n\n");
        library.checkoutItem("Seena Maragatham");

        System.out.println("\n\n------------------------------------------------------------\n\n");

        library.listAvailableItems();

    }
}
