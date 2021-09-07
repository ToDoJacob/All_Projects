package kinder2;

public class Teacher {
	private String teacherId;
	private String teacherName;
	private String entryDate;
	private String kinderClass;
	
	public Teacher() {}
	public Teacher(String teacherName, String kinderClass) {
		this.teacherName = teacherName;
		this.kinderClass = kinderClass;
	}
	
	@Override
	public String toString() {
		return "[선생님번호 : " + teacherId + ", 선생님이름 : " + teacherName  + ", 담당반 : " + kinderClass
				+ ", 시작일 : "+ entryDate +  "]";
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	public String getKinderClass() {
		return kinderClass;
	}
	public void setKinderClass(String kinderClass) {
		this.kinderClass = kinderClass;
	}

}
