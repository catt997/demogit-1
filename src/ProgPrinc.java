public class ProgPrinc {

    public static void main(String[] args) {
        MyLibrary library = new MyLibrary();

// poz 0
        Book b = new Book("Ion", new Author("liviu rebreanu"));
        library.addBook(b);

        //poz 1
        EBook eb = new EBook("Padurea S", new Author("liviu rebreanu"), "padureasp.pdf");
        library.addBook(eb);
        library.list();


    }
}

//comment
