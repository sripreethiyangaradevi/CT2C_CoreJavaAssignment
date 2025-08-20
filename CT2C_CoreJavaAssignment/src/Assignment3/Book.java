package Assignment3;


	public class Book extends Item {
	    String author;

	    public Book(int id, String title, String author) {
	        super(id, title);
	        this.author = author;
	    }

	    @Override
	    public String toString() {
	        return "[ID: " + id + ", Title: " + title + ", Author: " + author + "]";
	    }

	    public String shortInfo() {
	        return title + " by " + author;
	    }
	}



