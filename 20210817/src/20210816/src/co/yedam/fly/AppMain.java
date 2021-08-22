package co.yedam.fly;

public class AppMain {

	public static void main(String[] args) {

		Human human = new Human();
		human.eat();
		human.think();

		Bird bird = new Bird();
		bird.eat();
		bird.layEggs();

		Superman superman = new Superman();
		superman.eat();
		superman.think();
		superman.fly();
	}

}
