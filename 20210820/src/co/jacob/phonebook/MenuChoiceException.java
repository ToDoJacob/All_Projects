package co.jacob.phonebook;

public class MenuChoiceException extends Exception {
	int wrongChoice;
	
	public MenuChoiceException(int choice)
	{
		super("�뾾�뒗 硫붾돱踰덊샇�엯�땲�떎.");
		wrongChoice=choice;
	}
	
	public void showWrongChoice()
	{
		System.out.println(wrongChoice+"�뒗 �뾾�뒗 硫붾돱踰덊샇�엯�땲�떎.");
	}
}
