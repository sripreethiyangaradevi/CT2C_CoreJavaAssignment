package Assignment3;
public class Item {
	    int id;
	    String title;

	    public Item(int id, String title) {
	        this.id = id;
	        this.title = title;
	    }

	    public void displayInfo() {
	        System.out.println(this);
	    }

	    // toString() to return formatted string
	    @Override
	    public String toString() {
	        return "[ID: " + id + ", Title: " + title + "]";
	    }
	}


