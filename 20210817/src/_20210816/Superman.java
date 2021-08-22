package _20210816;

public class Superman extends Human{
	
	//
	public void takeoff() {
		System.out.println("½´ÆÛ¸Ç ÀÌ·ú");
	}
	@Override
	public void run() {
		System.out.println("ºü¸¥ ´ë½Ã");
		super.run();
	}
	public void fly() {
		System.out.println("½´ÆÛ¸Ç ³¯´Ù");
	}
	public void land() {
		System.out.println("½´ÆÛ¸Ç Âø·ú");
	}

}
