package love.programming;

public class MymainMethod {

    public static void main(String[] args) {


        Person myObject1= new Person("Raghav");
        Person myObject2= new Person("Raghav","Kolar");
        Person myObject3= new Person("Raghav","Kolar",18);

        Book myBookoOject=new Book("Thiller",40,"Evil Dead");
        Book myDefaultBook=new Book();

        System.out.println("myDefaultBook book genre is "+myDefaultBook.getBookZoner());

        System.out.println("First Name " +myObject1.firtsName);
        System.out.println("First Name " +myObject2.firtsName + "  Last Name " +myObject2.lastName);
        System.out.println("First Name " +myObject2.firtsName + "  Last Name " +myObject2.lastName +"  Age " +myObject3.age);

        System.out.println("My New Book Detials : Book Name " +myBookoOject.bookName +"BookGenre   :" +myBookoOject.bookGenre + "  Number of Pages in the Book: " +myBookoOject.numberOfPages);


    }

}
