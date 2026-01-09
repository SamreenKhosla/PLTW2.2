/**
 * Activity 2.2.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;

  public void addBook(Book b)
  {
    book = b;
  }

  @Override
public String toString() {
  if (book == null) {
    return "MediaLib is empty.";
  }
  return "MediaLib contains: " + book;
}

// CODE TO ADD
public Book getBook()
{
  return book;
}


}