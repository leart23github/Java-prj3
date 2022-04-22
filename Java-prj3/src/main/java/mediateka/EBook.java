package mediateka;
public class EBook extends Media {
    private String author;
    private String numberOfPages;

    public EBook(String ty, String n, String a, String sz, String np) {
        setType(ty);
        setName(n);
        setAuthor(a);
        setSize(sz);
        setNumberOfPages(np);
    }

    public String toString() {
        return "Type: " + getType() + " Name: " + getName() + " Author: " + getAuthor() + " Size in mb: "
                + getSize() + " Number of pages: "
                + getNumberOfPages();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
