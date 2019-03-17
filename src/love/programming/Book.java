package love.programming;

public class Book {


    String bookGenre;
    int numberOfPages;
    String bookName;


 public Book() {
//     this("defaultGenre",18,"defaultBook name");
//     System.out.println("I am empty constructor");

 }

 public Book(String bookGenre, int numberOfPages, String bookName) {

     this.bookGenre=bookGenre;
     this.numberOfPages=numberOfPages;
     this.bookName=bookName;
 }
    public Book(int numberOfPages, String bookName) {

        this.numberOfPages=numberOfPages;
        this.bookName=bookName;
    }
 public Book(String bookGenre ){
     this(18 ,"defaulName");
     this.bookGenre=bookGenre;


 }


    public void setBookZoner(String bookZoner) {
        this.bookGenre = bookZoner;
    }

    public void setNumberOfPages(int numberOfPages) {
        numberOfPages = numberOfPages;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookZoner() {
        return bookGenre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getBookName() {
        return bookName;
    }
}

