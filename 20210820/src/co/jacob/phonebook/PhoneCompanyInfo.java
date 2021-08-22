package co.jacob.phonebook;


public class PhoneCompanyInfo extends PhoneInfo{
	
	String company;
	
	public PhoneCompanyInfo(String name, String num, String company)
	{
		super(name, num);
		this.company=company;
	}
	
	@Override
	public void showPhoneInfo()
	{
		super.showPhoneInfo();
		System.out.println("company: "+company);
	}

	@Override
	public String toString() {
		return INPUT_SELECT.COMPANY +"," + name + "," + phoneNumber + "," + company + "\n";
	}
}
