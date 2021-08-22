package co.jacob.phonebook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class PhoneBookManager {
	private final File dataFile=new File("d:/PhoneBook.txt");
	
	HashSet<PhoneInfo> infoStorage=new HashSet<PhoneInfo>();
	
	static PhoneBookManager inststance=null;
	public static PhoneBookManager getInstance()
	{
		if(inststance==null)
			inststance=new PhoneBookManager();
		
		
		return inststance;
	}
	
	public PhoneBookManager()
	{
		readFromFile();
	}
	
	private PhoneInfo readFriendInfo()
	{
		System.out.print("�씠由�>");
		String name=MenuViewer.keyboard.nextLine();
		System.out.print("�쟾�솕踰덊샇>");
		String phone=MenuViewer.keyboard.nextLine();
		return new PhoneInfo(name, phone);
	}
	
	private PhoneInfo readUnivFriendInfo()
	{
		System.out.print("�씠由�>");
		String name=MenuViewer.keyboard.nextLine();
		System.out.print("�쟾�솕踰덊샇>");
		String phone=MenuViewer.keyboard.nextLine();
		System.out.print("�쟾怨�>");
		String major=MenuViewer.keyboard.nextLine();
		System.out.print("�븰�뀈>");
		int year=MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		return new PhoneUnivInfo(name, phone, major, year);
	}
	
	private PhoneInfo readCompanyFriendInfo()
	{
		System.out.print("�씠由�>");
		String name=MenuViewer.keyboard.nextLine();
		System.out.print("�쟾�솕踰덊샇>");
		String phone=MenuViewer.keyboard.nextLine();
		System.out.print("�쉶�궗紐�>");
		String company=MenuViewer.keyboard.nextLine();
		return new PhoneCompanyInfo(name, phone, company);	
	}	
	
	public void inputData() throws MenuChoiceException
	{
		System.out.println("�쟾�솕踰덊샇 援щ텇");
		System.out.println("1. �씪諛�, 2. ���븰, 3. �쉶�궗");
		System.out.print("�꽑�깮> ");
		int choice=MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		PhoneInfo info=null;
		
		if(choice<INPUT_SELECT.NORMAL || choice>INPUT_SELECT.COMPANY)
			throw new MenuChoiceException(choice);
		
		switch(choice)
		{
		case INPUT_SELECT.NORMAL:
			info=readFriendInfo();
			break;
		case INPUT_SELECT.UNIV:
			info=readUnivFriendInfo();
			break;
		case INPUT_SELECT.COMPANY:
			info=readCompanyFriendInfo();
			break;
		}
		
		boolean isAdded=infoStorage.add(info);
		
		if(isAdded==true)
			System.out.println("�벑濡앹셿猷� \n");
		else
			System.out.println("�벑濡앹삤瑜� \n");
	}
	
	public void searchData()
	{	
		System.out.print("�씠由�>");
		String name=MenuViewer.keyboard.nextLine();
		
		PhoneInfo info=search(name);
		if(info==null)
		{
			System.out.println("李얜뒗 �씠由꾩씠 �뾾�뒿�땲�떎. \n");
		}
		else
		{
			info.showPhoneInfo();		
		}
	}
	
	public void deleteData()
	{		
		System.out.print("이름>");
		String name=MenuViewer.keyboard.nextLine();
		
		Iterator<PhoneInfo> itr=infoStorage.iterator();
		while(itr.hasNext())
		{
			PhoneInfo curInfo=itr.next();
			if(name.compareTo(curInfo.name)==0)
			{
				itr.remove();
				System.out.println("삭제완료. \n");
				return;
			}
		}
		
		System.out.println("삭제할 이름이 없습니다. \n");	
	}
	
	private PhoneInfo search(String name)
	{
		Iterator<PhoneInfo> itr=infoStorage.iterator();
		while(itr.hasNext())
		{
			PhoneInfo curInfo=itr.next();
			if(name.compareTo(curInfo.name)==0)
				return curInfo;
		}
		return null;
	}
	
	public void storeToFile()
	{
		try
		{
			FileOutputStream file=new FileOutputStream(dataFile);		
			/*ObjectOutputStream out=new ObjectOutputStream(file);
			Iterator<PhoneInfo> itr=infoStorage.iterator();
			while(itr.hasNext())
			out.writeObject(itr.next()); */
			
			FileWriter out = new FileWriter(dataFile);
			Iterator<PhoneInfo> itr=infoStorage.iterator();
			while(itr.hasNext()) {
				out.write(itr.next().toString());
			}			
			out.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void readFromFile()
	{
		if(dataFile.exists()==false)
			return;
		
		try
		{
/*			FileInputStream file=new FileInputStream(dataFile);		
			ObjectInputStream in=new ObjectInputStream(file);
			
			while(true)
			{
				PhoneInfo info=(PhoneInfo)in.readObject();
				if(info==null)
					break;
				infoStorage.add(info);
			}*/
			
			 FileReader reader = new FileReader(dataFile);//reader.read()
	         BufferedReader in = new BufferedReader(reader);
	         String string;
	         PhoneInfo info= null;
	         while ((string = in.readLine()) != null) {
	        	 String[] record = string.split(",");
	        	 int gbn = Integer.parseInt(record[0]); 
	        	 switch(gbn)
	     		{
	     		case INPUT_SELECT.NORMAL:
	     			info = new PhoneInfo(record[1],record[2]); 
	     			break;
	     		case INPUT_SELECT.UNIV:
	     			info = new PhoneUnivInfo(record[1],record[2],record[3],Integer.parseInt(record[4])); 
	     			break;
	     		case INPUT_SELECT.COMPANY:
	     			info=new PhoneCompanyInfo(record[1],record[2],record[3]);
	     			break;
	     		}      	
	        		
	        	 infoStorage.add(info);
	        	 System.out.println(string);
	         }
	         in.close();
		}
		catch(IOException e)
		{
			return;
		}
	}
}
