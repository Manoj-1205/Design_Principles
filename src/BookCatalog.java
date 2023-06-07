import Books.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;



public class BookCatalog {
    List<Book> listOfBooks;
    BookCatalog(){
        this.listOfBooks = new ArrayList<>();
    }
    public void addBook(Book book){
        listOfBooks.add(book);
    }
    public void removeBook(Book book){
        listOfBooks.remove(book);
    }
    public boolean searchBookByTitle(String title){
        for(Book book : listOfBooks){
            if(book.getTitle().equals(title)) return true;
        }
        return false;
    }
    public boolean searchBookByAuthor(String author){
        for(Book book : listOfBooks){
            if(book.getAuthor().equals(author)) return true;
        }
        return false;
    }

}
