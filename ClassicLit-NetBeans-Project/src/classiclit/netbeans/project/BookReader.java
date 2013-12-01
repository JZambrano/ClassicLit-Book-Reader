/*
 * Programmers: Reda Yacouby, Jessica Zambrano, Daniel Villalpando, Anthony Meza
 * COSC-4/5346: Software Engineering
 * The University of Texas at Brownsville
 * Fall 2013
 */
package classiclit.netbeans.project;

import java.awt.Color;
import java.awt.Font;

/**
 *
 */
public class BookReader {
    
    Book book;
    Settings settings;
    
    public BookReader(){
        
    }
    public void loadBook(Book book){
        
    }
    public void goToChapter(Book.Chapter chapter){
        
    }
    public Book getBook(){
        return book;
    }
    public void setBook(Book book_){
        book = book_;
    }
    
    
    class Settings{
        int zoomPercentage = 100;
        Color backgroundColor = Color.WHITE;
        Color highlightColor = Color.YELLOW;
        Font font;
        
        public Settings(){
            
        }
        
        public int getZoomPercentage(){
            return zoomPercentage;
        }
        public Color getBackgroundColor(){
            return backgroundColor;
        }
        public Color getHighlightColor(){
            return highlightColor;
        }
        public Font getFont(){
            return font;
        }
        public void setZoomPercentage(int zoomPercentage_){
            zoomPercentage = zoomPercentage_;
        }
        public void setBackgroundColor(Color backgroundColor_){
            backgroundColor = backgroundColor_;
        }
        public void setHighlightColor(Color highlightColor_){
            highlightColor = highlightColor_;
        }
        public void setFont(Font font_){
            font = font_;
        }
    }
    
}
