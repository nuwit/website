/*
Design a smart library using Object Oriented Programming

Questions:
What type of contents are shared in this library? - Books? Videos?
How should we organize the library?
Is there a maximum amount of books?

Book Object
- Author or Authors?
- Title

Library Object
- Data structure to store Book objects
- Function to get books by author
- Search for book by title
- Search for book by title and author

======
Rental management functionality

Questions:
Should each book manage whether or not it is rented or should the library manage a book's rental?
Do we want to store who rented the book and when it is next avaliable?

*/

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    Book book = new Book("Of Mice and Men", "John Steinbeck");
    System.out.print(book.toString());
  }
}

// you can add other public classes to this editor in any order
public class Book
{
  private String title;
  private String author;
  
  public Book(String title, String author)
  {
    this.title = title;
    this.author = author;
  }
  
  public String toString()
  {
    return new String(getTitle() + " by " + getAuthor());
  }
  
  public String getTitle() {
    return title;
  }
  
  public String getAuthor() {
    return author;
  }
}

// you can add other public classes to this editor in any order
public class Library
{
  ArrayList<Book> books = new ArrayList<Book>();

  public Library(ArrayList<Book> books)
  {
  	this.books = books;
  }

  public void addBook(Book book) {
  	books.add(book);
  }


  public ArrayList<Book> getBooks() {
  	return books;
  }
}
