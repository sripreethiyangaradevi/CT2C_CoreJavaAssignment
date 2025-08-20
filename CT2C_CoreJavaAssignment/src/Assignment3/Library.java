package Assignment3;
    import java.util.ArrayList;
	import java.util.List;

	public class Library {
	    private List<Item> items = new ArrayList<>();

	    public void addItem(Item item) {
	        items.add(item);
	    }

	    public void showLibrary() {
	        System.out.println("Library contains:");
	        for (Item item : items) {
	            if (item instanceof Book) {
	                System.out.println("- " + ((Book) item).shortInfo());
	            } else if (item instanceof Magazine) {
	                System.out.println("- " + ((Magazine) item).shortInfo());
	            }
	        }
	    }
	}



