class Book {
	    String title;
	    String author;
	    int yearPublished;
	  
	    public Book() {
	        this.title = "Until You Say It";
	        this.author = "secretly_chasing";
	        this.yearPublished = 2022;
	    }
	  
	    public Book(String title, String author, int yearPublished) {
	        this.title = title;
	        this.author = author;
	        this.yearPublished = yearPublished;
	    }
	  
	    public void displayBook() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Year Published: " + yearPublished);
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Book book1 = new Book();
	        System.out.println("Book 1:");
	        book1.displayBook();
	      
	        Book book2 = new Book ("It Ends with Us", "Colleen Hoover", 2016);
	        System.out.println("Book 2:");
	        book2.displayBook();
	    }
	}
