package Aggregation_8_7;

public class TextBook 
{
    private String title;
    private String author;
    private String publisher;
    
	public TextBook(String title, String author, String publisher) 
	{
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	public TextBook(TextBook object2)
	{
		title = object2.title;
		author = object2.author;
		publisher = object2.publisher;
	}
	
   public void set (String title, String author, String publisher)
   {
	   this.title = title;
	   this.author= author;
	   this.publisher = publisher;
   }
   
    public String toString()
    {
    	return "Title: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher; 
    }
    
    
    
}
