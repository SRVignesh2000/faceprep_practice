package day24;

import java.util.*;

class Shape {

	int length;
	int breadth;
	int height;
	int radius;

	public Shape() {
	}

	public Shape(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	public Shape(int radius) {
		this.radius = radius;
	}

	public Shape(int radius, int height) {
		this.radius = radius;
		this.height = height;
	}

	public float calculateAreaOfCylinder(int radius, int height) {
		float areaOfCylinder = (float) 3.14 * (radius * radius) * height;
		return areaOfCylinder;
	}

	public double calculateAreaOfSphere(int radius) {
		double areaOfSphere = (float) (4.0 / 3.0) * 3.14 * (radius * radius * radius);
		return areaOfSphere;
	}

	public int volumeOfCube(int length, int breadth, int heigth) {
		int areaOfCube = length * breadth * heigth;
		return areaOfCube;
	}
}

class Main {
	public static void main(String args[]) {
		// type your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Cube");
		System.out.println("2.Sphere");
		System.out.println("3.Cylinder");
		System.out.println("Enter the choice");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("length");
			int length = sc.nextInt();
			System.out.println("breadth");
			int breadth = sc.nextInt();
			System.out.println("height");
			int height = sc.nextInt();
			Shape shape = new Shape(length, breadth, height);
			System.out.println("Area of Cube is " + shape.volumeOfCube(length, breadth, height));

		}
		if (choice == 2) {
			System.out.println("radius");
			int radius = sc.nextInt();
			Shape shape = new Shape(radius);
			System.out.println("Area of Sphere is " + shape.calculateAreaOfSphere(radius));
		}
		if (choice == 3) {
			System.out.println("radius");
			int radius = sc.nextInt();
			System.out.println("height");
			int height = sc.nextInt();
			Shape shape = new Shape(radius, height);
			System.out.println("Area of Cylinder is " + shape.calculateAreaOfCylinder(radius, height));
		}

	}
}







//import java.util.*;
//public class Main {
//
//	int len;
//	int bre;
//	int hei;
//	float rad;
//
//	public Main(int len, int bre, int hei) {
//		this.len = len;
//		this.bre = bre;
//		this.hei = hei;
//	}
//
//	public int getVolumeOfCube() {
//		return len * bre * hei;
//	}
//
//	public Main(float rad) {
//		this.rad = rad;
//	}
//
//	public float getVolumeOfSphere() {
//		return (float) ((4.0 / 3.0) * 3.14 * rad * rad * rad);
//	}
//
//	public Main(float rad, int hei) {
//		this.rad = rad;
//		this.hei = hei;
//	}
//
//	public float getVolumeOfCylinder() {
//		return (float) (3.14 * rad * rad * hei);
//	}
//
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("1.Cube");
//		System.out.println("2.Sphere");
//		System.out.println("3.Cylinder");
//		System.out.println("Enter the choice");
//		int cho = sc.nextInt();
//		if (cho == 1) {
//			int len = sc.nextInt();
//			int bre = sc.nextInt();
//			int hei = sc.nextInt();
//			Main res = new Main(len, bre, hei);
//
//			System.out.println("length");
//			System.out.println("breadth");
//			System.out.println("height");
//			System.out.println("Area of Cube is " + res.getVolumeOfCube());
//		} else if (cho == 2) {
//			int rad = sc.nextInt();
//			Main res = new Main(rad);
//
//			System.out.println("radius");
//			System.out.printf("Area of Sphere is %.2f", res.getVolumeOfSphere());
//		} else if (cho == 3) {
//			int rad = sc.nextInt();
//			int hei = sc.nextInt();
//			Main res = new Main(rad, hei);
//
//			System.out.println("radius");
//			System.out.println("height");
//			System.out.printf("Area of Cylinders is %.1f", res.getVolumeOfCylinder());
//		}
//	}
//}
