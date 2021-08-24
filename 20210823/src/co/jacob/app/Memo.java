package co.jacob.app;

public class Memo {
	private String no;
	private String date;
	private String content;
	
	public Memo() {}
	public Memo(String no , String date, String content) {
		this.no = no;
		this.date = date;
		this.content = content;
	}
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		
		return no +","+this.getDate()+","+getContent()+"\n";
	}
}
