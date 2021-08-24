package co.jacob.app.클래스;

//개발표준 을 정해주기위해
//상수(public static) + 추상메서드(public abstract)인 상태가 기본

public interface MemberAccess {
	boolean saveData();
	boolean deleteData(String id);
	Member searchData(String id);
}
