/*
 * Activity 2.2.7
 * 
 * The runner for the MediaLib program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();

    System.out.println("Library:\n" + myLib);


    // create a Book and confirm it was created
    Book myBook = new Book("Lord of the Rings", "Tolkien");
    System.out.println("Book created " + myBook);

    //myBook.setTitle("The Hunger Games");
    myBook.setAuthor("Suzanne Collins");
   

    System.out.println("Updated book via myBook: " + myBook);

    System.out.println("Library now contains: " + myLib);
    

    myLib.addBook(myBook); 
    System.out.println("Library:\n" + myLib); 

    // CODE TO ADD
    int myRating = 100;
    myBook.adjustRating(myRating);
    System.out.println(myBook);

    // CODE TO ADD
    Book currBook = myLib.getBook();
    currBook.setTitle("My Favorite Book");
    System.out.println("Current book: " + currBook);

    // CODE TO ADD
    System.out.println(myLib);

    
    /*
 * Activity 2.2.7
 */
    System.out.println("You have a NEW Library");
    MediaLib myLib2 = new MediaLib();

    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook);
    System.out.println(myLib2);
    newBook = new Book("1984", "Orwell");
    System.out.println(myLib2);

  }
}

