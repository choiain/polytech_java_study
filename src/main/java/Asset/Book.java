package Asset;

public class Book extends TangibleAsset {

    String isbn;

    public Book(String name, int price, String color) {
        super(name, price, color);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
