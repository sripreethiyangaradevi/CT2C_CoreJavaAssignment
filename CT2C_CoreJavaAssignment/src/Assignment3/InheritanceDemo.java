package Assignment3;



	public class InheritanceDemo {
	    public static void main(String[] args) {
	        Book book = new Book(101, "Java Basics", "James Gosling");
	        Magazine magazine = new Magazine(201, "Tech Today", 45);

	        System.out.println("Book: " + book);
	        System.out.println("Magazine: " + magazine);

	        System.out.println();

	        Library library = new Library();
	        library.addItem(book);
	        library.addItem(magazine);

	        library.showLibrary();
	    }
	}



