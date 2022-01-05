public class EBook extends Book{

    private String fileName;

    EBook(String name, Author author, String filename) {
        super(name, author);
        this.fileName=filename;
    }

    @Override
    public String display() {
        String valToReturn=super.getName()+", "+super.getAuthor().getName()+", "+fileName;
        return valToReturn;
    }
}
