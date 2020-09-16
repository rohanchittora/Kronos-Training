package q2;

import java.util.Arrays;
import java.util.Scanner;

class BookStore {
	private Book[] books = new Book[10];

	public void order(String isbn, int noOfCopies) {
		for (Book book : books) {
			if (book != null && book.getISBN().equals(isbn)) {
				book.setNumOfCopies(book.getNumOfCopies() + noOfCopies);
				break;
			}
			else if (book == null) {
				Scanner sc = new Scanner(System.in);
				System.out.println("no book found.");
				System.out.print("Enter  title: ");
				String bookTitle = sc.nextLine();
				System.out.print("Enter author: ");
				String author = sc.nextLine();
				books[Arrays.asList(books).indexOf(book)] = new Book(bookTitle, author, isbn, noOfCopies);
				break;
			}
		}
	}

	public void sell(String bookTitle, int noOfCopies) {
		Book select = null;
		for (Book book : books) {
			if (book.getBookTitle().equals(bookTitle) && book != null) {
				select = book;
				break;
			}
		}
		if (select != null) {
			select.setNumOfCopies(Math.max(0, select.getNumOfCopies() - noOfCopies));
		} else {
			System.out.println("Book not found in the store.");
		}
	}

	public void display() {
		System.out.println("Info of all books");
		for (Book book : books) {
			if (book != null)
				book.display();
		}
	}
}