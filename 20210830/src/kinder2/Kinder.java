package kinder2;


public class Kinder {
	private String kinderId;
	private String kinderName;
	private String kinderAge;
	private String kinderClass;
	private String parentPhone;
	private String admissionDate;
	

	
	public Kinder() {}
	public Kinder(String kinderId, String kinderName, String kinderAge, String kinderClass, String parentPhone, String admissionDate) {
		this.kinderId = kinderId;
		this.kinderName = kinderName;
		this.kinderAge = kinderAge;
		this.kinderClass = kinderClass;
		this.parentPhone = parentPhone;
		this.admissionDate = admissionDate;
	}
	public Kinder(String kinderName) {
		this.kinderName = kinderName;
		this.kinderId = "";
		this.kinderAge = "";
	}

			
	@Override
	public String toString() {
		return "[원생번호 : " + kinderId + ", 원생이름 : " + kinderName + ", 원생나이 : " + kinderAge + ", 반 : "
				+ kinderClass + ", 입학일 : " + admissionDate + ", 부모님연락처 : " + parentPhone + "]";
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
	
	
}
