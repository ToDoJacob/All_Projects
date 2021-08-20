package co.jacob.phonebook;


public class PhoneUnivInfo extends PhoneInfo{
	
	String major;
	int year;	
	
	public PhoneUnivInfo(String name, String num, String major, int year)
	{
		super(name, num);
		this.major=major;
		this.year=year;
	}
	
	public void showPhoneInfo()
	{
		super.showPhoneInfo();
		System.out.println("major: "+major);
		System.out.println("year: "+year);
	}

	public String toString() {
		return INPUT_SELECT.UNIV + "," + name + "," + phoneNumber  + "," + major + "," + year + "\r\n";
	}
	
}
