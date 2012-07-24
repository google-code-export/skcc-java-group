package Coaching.hw2.book;

public class BookCatalog {
	private Book[] books;
	
	public BookCatalog() {
		books = new Book[4];
		books[0] = new Book("�ڹ� 7 ���α׷���", 28000);
		books[1] = new Book("�ڹ� �� ����", 25000);
		books[2] = new Book("���Ƕ� �����ΰ�", 15000);
		books[3] = new Book("�ڹ� ��Ʈ��ŷ", 22000);
	}

	public void printAllBooks() {
		for (Book book : books) {
			book.printInfo();
		}
	}
	
	public void printBooksTitleLike(String keyword) {
		System.out.println("keyword : " + keyword);
		for (Book book : books) {
			if (book.titleLike(keyword)) {
				book.printInfo();
			}
		}
	}
}
