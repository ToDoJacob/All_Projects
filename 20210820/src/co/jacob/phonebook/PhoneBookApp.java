package co.jacob.phonebook;

public class PhoneBookApp {
	
	public static void main(String[] args)
	{
		PhoneBookManager manager=PhoneBookManager.getInstance();
		int choice;
		
		while(true)
		{
			try
			{
				MenuViewer.showMenu();
				choice=MenuViewer.keyboard.nextInt();
				MenuViewer.keyboard.nextLine();
				
				if(choice<INIT_MENU.INPUT || choice>INIT_MENU.EXIT)
					throw new MenuChoiceException(choice);
				
				switch(choice)
				{
				case INIT_MENU.INPUT:
					manager.inputData();
					break;
				case INIT_MENU.SEARCH:
					manager.searchData();
					break;
				case INIT_MENU.DELETE:
					manager.deleteData();
					break;
				case INIT_MENU.EXIT:
					manager.storeToFile();
					return;
				}
			}
			catch(MenuChoiceException e)
			{
				e.showWrongChoice();
			}
		}
	}
}
