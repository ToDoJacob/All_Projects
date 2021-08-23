package _20210816;

public class Bird extends Animal{
	
	public void takeoff() {
		System.out.println("ÀÌ·ú");
	}
	public void fly() {
		System.out.println("ºñÇà");
	}
	@Override
	public void run() {
		System.out.println("ÁÖ·Î ³¯¾Æ´Ù´Ñ´Ù.");
		super.run();
	}
	@Override
	public void eat() {
		System.out.println("¹ú·¹¸¦ ¸Ô´Â´Ù");
		super.eat();
	}
	public void land() {
		System.out.println("Âø·ú");
	}
	public void layEggs() {
		System.out.println("¾ËÀ» ³º´Ù");
	}
}
