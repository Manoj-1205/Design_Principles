package Books;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Book {
    private int bookId;
    private String title;
    private String author;
    private String genre;
    private int availability;
}
