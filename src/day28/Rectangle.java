package day28;

class Floor {
	// Type your code here
	private double width;
	private double length;

	public Floor(double width, double length) {
		if (length <= 0) {
			this.length = 0;
		} else {
			this.length = length;
		}

		if (width <= 0) {
			this.width = 0;
		} else {
			this.width = width;
		}
	}

	public double getArea() {
		return this.length * this.width;
	}

}

class Carpet {
	// Type your code here
	private double cost;

	public Carpet(double cost) {
		if (cost <= 0) {
			this.cost = 0;
		} else {
			this.cost = cost;
		}
	}

	public double getCost() {
		return this.cost;
	}
}

class Calculator {
	// Type your code here
	private Floor floor;
	private Carpet carpet;

	public Calculator(Floor f, Carpet c) {
		this.floor = f;
		this.carpet = c;
	}

	public double getTotalCost() {
		return floor.getArea() * carpet.getCost();
	}
}

public class Rectangle {
	public static void main(String args[]) {
		Carpet carpet = new Carpet(3.5);
		Floor floor = new Floor(2.75, 4.0);
		Calculator calculator = new Calculator(floor, carpet);
		System.out.println("Total = " + calculator.getTotalCost());
		carpet = new Carpet(1.5);
		floor = new Floor(5.4, 4.5);
		calculator = new Calculator(floor, carpet);
		System.out.println("Total = " + calculator.getTotalCost());
	}
}
