package bookmanager;

public interface BookAccess {

	boolean saveData(Book book);
	void searchData();
	boolean deleteData(String book);
}
