package co.jacob.phonebook;

import java.io.Serializable;

public class PhoneInfo  implements Serializable{
	
	String name;
	String phoneNumber;
	
	public PhoneInfo(String name, String phoneNumber)
	{
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
	
	public void showPhoneInfo()
	{
		System.out.println("name: "+name);
		System.out.println("phone: "+phoneNumber);
	}
	
	public int hashCode()
	{
		return name.hashCode();
	}
	
	public boolean equals(Object obj)
	{
		PhoneInfo cmp=(PhoneInfo)obj;
		if(name.compareTo(cmp.name)==0)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return  INPUT_SELECT.NORMAL +"," + name + "," + phoneNumber +"\r\n";
	}
	
}
