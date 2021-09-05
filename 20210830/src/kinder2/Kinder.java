package kinder2;

import java.time.LocalDate;

public class Kinder {
	private String kinderId;
	private String kinderName;
	private String kinderAge;
	private String kinderClass;
	private String parentPhone;
	private String admissionDate;
	
	private String teacherId;
	private String teacherName;
	private String entryDate;
	
	public Kinder() {}
	public Kinder(String kinderName, String kinderAge, String kinderClass, String parentPhone) {
		this.kinderName = kinderName;
		this.kinderAge = kinderAge;
		this.kinderClass = kinderClass;
		this.parentPhone = parentPhone;
	}
	public Kinder(String teacherId, String teacherName, String kinderClass) {
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.kinderClass = kinderClass;
	}
			
	@Override
	public String toString() {
		return "Kinder [kinderId=" + kinderId + ", kinderName=" + kinderName + ", kinderAge=" + kinderAge + ", kinderClass="
				+ kinderClass + ", admissionDate=" + admissionDate + ", parentPhone=" + parentPhone + "]";
	}
	public String getKinderId() {
		return kinderId;
	}
	public void setKinderId(String kinderId) {
		this.kinderId = kinderId;
	}
	public String getKinderName() {
		return kinderName;
	}
	public void setKinderName(String kinderName) {
		this.kinderName = kinderName;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getKinderAge() {
		return kinderAge;
	}
	public void setKinderAge(String kinderAge) {
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
//	public String getTeamIncharge() {
//		return teamIncharge;
//	}
//	public void setTeamIncharge(String teamIncharge) {
//		this.teamIncharge = teamIncharge;
//	}
	public String getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}

}
