package bookmanager;

public class Book {

	private String isbn;
	private String name;
	private String content;
	
	public Book() {}
	public Book(String isbn, String name, String content) {
		this.isbn = isbn;
		this.name = name;
		this.content = content;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return isbn + "," + name;
	}
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((content == null) ? 0 : content.hashCode());
//		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
	@Override
	public boolean equals(Object obj) {
		Book target = (Book)obj;
		return true;
	}
	

	
}
