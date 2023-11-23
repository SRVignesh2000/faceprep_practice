package practiseOOPS;

public abstract class Enemy {
	
	public void move() {
		System.out.println("Move");
	}
	
	public void speak() {
		System.out.println("Speak");
	}
	
	public abstract void legs();
}
