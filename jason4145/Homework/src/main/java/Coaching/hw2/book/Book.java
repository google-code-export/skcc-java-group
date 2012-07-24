package Coaching.hw2.book;

public class Book {
	private String title;
	private int price;

	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public boolean titleLike(String keyword) {
		if (keyword == null)
			return false;

		return this.title.contains(keyword);
	}

	public void printInfo() {
		System.out.println("����:" + title + ", ����:" + price);
	}
}
