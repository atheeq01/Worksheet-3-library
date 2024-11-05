abstract class BorrowableItems {
    abstract void displayInfo();
}


class Book extends BorrowableItems {
    private String title;
    private String author;
    private String ISBN;
    private boolean available;

    public Book(String title, String author, String ISBN) {
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
        this.available=true;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    void displayInfo(){
        System.out.println("Book Title : "+getTitle());
        System.out.println("Book Author : "+getAuthor());
        System.out.println("Book ISBN : "+getISBN());
        System.out.println("Book Is Available : "+isAvailable());
        System.out.println("\n");

    }
}
