public class Main{
    public static void main(String []args){
      LibraryBook book1 = new LibraryBook("OOP");
      LibraryBook book2 = new LibraryBook("DSA");
      LibraryBook book3 = new LibraryBook("COA");
      book1.checkOut();
      book2.checkOut();
      book1.returnBook();
      book2.returnBook();
      book1.checkOut();
      book2.checkOut();
      book2.checkOut();
        System.out.println(LibraryBook.getTotalBooksCheckedOut());
    }
}