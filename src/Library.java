public class Library {

    private String name;
    private Book[] books = new Book[100];

    private int count =  0;

    public Library(String name) {
        this.name = name;
    }

    public void add(Book book) {
        if(count == books.length){
            System.out.println("Hyllan är fullt!");
        }
        books[count] = book;
        count++;
    }

    public Book findByTitle(String title) {
    for( int i = 0; i < count; i++) {
            if(books[i].isAvailable()){
                return books[i];
            }
        }
        return null;
    }


    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i].getTitle());
        }
    }

}
