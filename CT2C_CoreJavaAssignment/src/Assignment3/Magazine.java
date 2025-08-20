package Assignment3;
public class Magazine extends Item {
	    int issueNumber;

	    public Magazine(int id, String title, int issueNumber) {
	        super(id, title);
	        this.issueNumber = issueNumber;
	    }

	    @Override
	    public String toString() {
	        return "[ID: " + id + ", Title: " + title + ", Issue: " + issueNumber + "]";
	    }

	    public String shortInfo() {
	        return title + " Issue " + issueNumber;
	    }
	}


