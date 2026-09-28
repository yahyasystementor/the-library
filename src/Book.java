public class Book {


    private String title;
    private String author;
    private int year;
    private boolean borrowed;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.borrowed = false;
    }

    public void borrow() {
        if (borrowed) {
            System.out.println("Redan utlånad: " + title );
        }
        borrowed = true;
        System.out.println("Lånade ut: " + title);
    }


    public void returnItem() {
        if (!borrowed) {
            System.out.println("Boken var inte utlånad: " + title );
        }
        borrowed = false;
        System.out.println("Återlämnad: " + title);

    }

    public boolean isAvailable() {
        return !borrowed;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}
