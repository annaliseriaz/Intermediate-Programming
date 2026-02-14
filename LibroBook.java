class Libro {
	String title;
	String author;
	int yearPublished;
	
	//for default constructor//
	public Libro() {
		this.title = "Kaya ko ba?";
		this.author = "Unknown author";
		this.yearPublished = 2021;
	}
	
	//for parameterized constructor//
	public Libro(String title, String author, int yearPublished) {
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished; 
	}
	
	//displaying the Book details//
	public void Bookdetails() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Year Published: " + yearPublished);
		System.out.println();
	}
	
	//main method//
	public static void main(String[] args) {
		//Creation of book object using default constructor//
		Libro libronumerouno = new Libro();
		System.out.println("Book 1 Details");
		libronumerouno.Bookdetails();
		
		//Creation of book object using parameterized constructor//
		Libro libronumerodos = new Libro("Until You Say It", "secretly_chasing", 2022);
		System.out.println("Book 2 Details");
		libronumerodos.Bookdetails();
	}
}
