/*
 * Programmers: Reda Yacouby, Jessica Zambrano, Daniel Villalpando, Anthony Meza
 * COSC-4/5346: Software Engineering
 * The University of Texas at Brownsville
 * Fall 2013
 */
package classiclit.netbeans.project;
import java.util.List;
import java.util.ArrayList;
/**
 *
 */
public class Library {
    private String path;
    private List<Book> books = new ArrayList<Book>();
    
    public Library(String path_){
        path = path_;
    }
    public void loadBooks(){
        
    }
    public void importBook(String bookPath){
        
    }
    public void deleteBook(Book book){
        
    }
    public List<Book> listByTitle(){
        return null;
    }
    public List<Book> listByAuthor(){
        return null;
    }
    public List<Book> listByGenre(){
        return null;
    }
    public void search(String keyword){
        
    }
    
    
}
