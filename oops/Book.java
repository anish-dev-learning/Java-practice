package oops;

public class Book {
    static int totalBooks;
    String title;
    String author;
    String isbn;  // book unique number
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }
//object Init
    {
        totalBooks++;
    } 

    Book(String isbn, String title, String author){
    this.isbn = isbn;
    this.title = title;
    this.author = author;
 }
    Book(String isbn){
    this(isbn, "Unknown", "Unknown");
 }

 static int getTotalNoOfBooks(){
    return totalBooks;
 }

 void borrowBook(){
    if(isBorrowed){
        System.out.println("Book is already borrowed");
    }else{
    this.isBorrowed = true;
    System.out.println("Book borrowed successfully");
    }
}
void returnBook(){
    if(isBorrowed){
        this.isBorrowed = false;
        System.out.println("HOpe you enjoyed, Please leave a review");
    }else{
        System.out.println("This book is already in the library");
    }
}

public static void main(String[] args) {
    Book designOfThings = new Book("1", "Design", "Author");
    Book myBook = new Book("2");
    System.out.println(Book.getTotalNoOfBooks());
    designOfThings.borrowBook();
    myBook.borrowBook();
    designOfThings.returnBook();
    designOfThings.returnBook();
}

}
