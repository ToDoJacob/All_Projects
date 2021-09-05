package co.jacob.kinder;

import java.time.LocalDate;

public class Kinder {
	LocalDate now = LocalDate.now();
	private String kinderId;
	private String lastName;
	private int kinderAge;
	private String kinderClass;
//	private LocalDate admissionDate;
	private String admissionDate;
	private String parentPhone;
	
	private String teacherName;
	private String teamIncharge;
	private String entryDate;
	
	public Kinder() {}
	public Kinder(String kinderId, String lastName, int kinderAge, String kinderClass, String parentPhone, String admissionDate) {
		this.kinderId = kinderId;
		this.lastName = lastName;
		this.kinderAge = kinderAge;
		this.kinderClass = kinderClass;
		this.admissionDate = admissionDate;
		this.parentPhone = parentPhone;
	}
	public Kinder(String teacherName, String teamIncharge, String entryDate) {
		this.teacherName = teacherName;
		this.teamIncharge = teamIncharge;
		this.entryDate = entryDate;
	}
			
	@Override
	public String toString() {
		return "Kinder [kinderId=" + kinderId + ", lastName=" + lastName + ", kinderAge=" + kinderAge + ", kinderClass="
				+ kinderClass + ", admissionDate=" + admissionDate + ", parentPhone=" + parentPhone + "]";
	}
	public String getKinderId() {
		return kinderId;
	}
	public void setKinderId(String kinderId) {
		this.kinderId = kinderId;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getKinderAge() {
		return kinderAge;
	}
	public void setKinderAge(int kinderAge) {
		this.kinderAge = kinderAge;
	}
	public String getKinderClass() {
		return kinderClass;
	}
	public void setKinderClass(String kinderClass) {
		this.kinderClass = kinderClass;
	}
	public String getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}
	public String getParentPhone() {
		return parentPhone;
	}
	public void setParentPhone(String parentPhone) {
		this.parentPhone = parentPhone;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeamIncharge() {
		return teamIncharge;
	}
	public void setTeamIncharge(String teamIncharge) {
		this.teamIncharge = teamIncharge;
	}
	public String getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}

}
