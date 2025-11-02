public class LibraryBook{
    private String title;
    private boolean isCheckedOut;
    private static int totalBooksCheckedOut;
    public LibraryBook(String title){
        this.title = title;
        this.isCheckedOut = false;
    }

    public void setTitle(String title){
    this.title = title;
    }
    public String getTitle(){
        return title;
    }

    public boolean isCheckOut(){
        return isCheckedOut;
    }

  public void checkOut(){
      if(!isCheckedOut){
          isCheckedOut = true;
          totalBooksCheckedOut ++;
          System.out.println( title + " has been checked out");
      }
      else{
          System.out.println( title + " has been already checked out");
      }
  }
  public void returnBook(){
        if(isCheckedOut){
            isCheckedOut = false;
            totalBooksCheckedOut --;
            System.out.println(title + " is returned");
        }
        else{
            System.out.println(title + " has been already returned");
        }
  }
  public static int getTotalBooksCheckedOut(){
      return totalBooksCheckedOut;
  }
}