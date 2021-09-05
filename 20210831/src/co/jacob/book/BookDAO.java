package co.jacob.book;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO extends DAO {

	public void deleteBook(String bookCode) {
		String sql = "delete from book_info where book_code = ?";
		connect();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookCode);
			
			pstmt.executeQuery();
			System.out.println("정상 삭제완료 ");
//			insert update delete 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public void updateBook(Book book) {
		String sql = "update book_info set book_title=?, book_author=?, "
				+ "					   book_publish=?, book_price=? " 
				+ "						where book_code=?";
		connect();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getBookTitle());
			pstmt.setString(2, book.getBookAuthor());
			pstmt.setString(3, book.getBookPublish());
			pstmt.setInt(4, book.getBookPrice());
			pstmt.setString(5, book.getBookCode());

			pstmt.executeUpdate();
			System.out.println("정상 수정완료." );

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public Book getBook(String bookCode) {
		String sql = "select * from book_info where book_code = ?";
		Book book = null;
		connect();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookCode);
			rs = pstmt.executeQuery();
			if (rs.next()) { // 조회했는데 값이있으면 아래 필드들을 채워서 리턴해주고
				book = new Book(); // 값이 없으면 null로 리턴
				book.setBookAuthor(rs.getString("book_author"));
				book.setBookCode(rs.getString("book_code"));
				book.setBookPrice(rs.getInt("book_price"));
				book.setBookPublish(rs.getString("book_publish"));
				book.setBookTitle(rs.getString("book_title"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return book;

	}

	public List<Book> searchBook(Book book) {
		String sql = "select * from book_info";
		if (book.getBookAuthor() != null) {
			sql += " where book_author like '%'||?||'%'";
		} else if (book.getBookTitle() != null) {
			sql += " where book_tirle like '%'||?||'%'";
		} else if (book.getBookPublish() != null) {
			sql += " where book_tirle like '%'||?||'%'";
		}
		List<Book> bookList = new ArrayList<Book>();
		
		connect();
		try {
			pstmt = conn.prepareStatement(sql);
			if (book.getBookAuthor() != null) { // 조회조건 : 저자명.
				pstmt.setString(1, book.getBookAuthor());
			} else if (book.getBookTitle() != null) { // 조회조건 : 책제목
				pstmt.setString(1, book.getBookTitle());
			} else if (book.getBookPublish() != null) { // 조회조건 : 출판사
				pstmt.setString(1, book.getBookPublish());
			}
			rs = pstmt.executeQuery(); // 조회결과 -> ResultSet
			while (rs.next()) { // 데이터가 있으면 계속 데이터를 하나씩 가져온다.
				Book bk = new Book();
				bk.setBookCode(rs.getString("book_code"));
				bk.setBookAuthor(rs.getString("book_author"));
				bk.setBookTitle(rs.getString("book_title"));
				bk.setBookPublish(rs.getString("book_publish"));
				bk.setBookPrice(rs.getInt("book_price"));

				bookList.add(bk);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return bookList; // 조회된 결과를 List컬렉션에 담아서 반환.
	}

	public void insertBook(Book book) {
		String sql = "insert into book_info(book_code, book_title, book_author, book_publish, book_price) "//
				+ "values(?,?,?,?,?)";
		connect();
		try {
			pstmt = conn.prepareStatement(sql); // pstmt
			pstmt.setString(1, book.getBookCode());
			pstmt.setString(2, book.getBookTitle());
			pstmt.setString(3, book.getBookAuthor());
			pstmt.setString(4, book.getBookPublish());
			pstmt.setInt(5, book.getBookPrice()); // ? => 파라미터값을 다 셋팅.
			int r = pstmt.executeUpdate();
			System.out.println("입력완료 " + r);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
}
