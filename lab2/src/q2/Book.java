package q2;

class Book {
	private String bookTitle;
	private String author;
	private String ISBN;
	private int numOfCopies;

	public Book(String author, String bookTitle, String ISBN, int numOfCopies) {
		this.author = author;
		this.bookTitle = bookTitle;
		this.ISBN = ISBN;
		this.numOfCopies = numOfCopies;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}

	public void display() {
		System.out.println(this.author + " - " + this.bookTitle + " - " + this.ISBN + " - " + this.numOfCopies);
	}
}
