package practiseOOPS;

public class Dog extends Enemy {
	
	@Override
	public void move() {
		System.out.println("Walk");
	}

	public void speak() {
		System.out.println("bark");
	}

	@Override
	public void legs() {
		System.out.println();
	}
	
	public void legs(int n) {
		System.out.println(n);
	}

}
