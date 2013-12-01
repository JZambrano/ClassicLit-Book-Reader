/*
 * Programmers: Reda Yacouby, Jessica Zambrano, Daniel Villalpando, Anthony Meza
 * COSC-4/5346: Software Engineering
 * The University of Texas at Brownsville
 * Fall 2013
 */
package classiclit.netbeans.project;
import java.awt.Image;

/**
 * 
 */
public class Book {
    private String title;
    private String author;
    private String genre;
    private Image thumbnail;
    private String filePath;
    private TableOfContents tableOfContents;
    
    public Book(String title_, String author_, String genre_, Image thumbnail_,
            String filePath_){
        title = title_;
        author = author_;
        genre = genre_;
        thumbnail = thumbnail_;
        filePath = filePath_;
        
    }
    
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getGenre(){
        return genre;
    }
    public Image getThumbnail(){
        return thumbnail;
    }
    public String getFilePath(){
        return filePath;
    }
    public void setAuthor(String author_){
        author = author_;
    }
    public void setGenre(String genre_){
        genre = genre_;
    }
    public void setTitle(String title_){
        title = title_;
    }
    
    
    public class TableOfContents {

        Chapter chapters[];
        public TableOfContents(){
        
        }
    }
    
    
    public class Chapter {
        private String title;
        private int number;

        public Chapter(String title_, int number_){
            title = title_;
            number = number_;
        }

        public String getTitle(){
            return title;
        }
        public int getNumber(){
            return number;
        }
    
    }
    
}
