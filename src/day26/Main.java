package day26;

import java.util.Scanner;

class Student {

	private String name;
	private char gender;
	private int age;
	private long idNumber;
	private double cgpa;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(long idNumber) {
		this.idNumber = idNumber;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

}

class College extends Student {
	private int year;
	private String major;
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	

	public College(String name, char gender, int age, long idNumber, double cgpa, int year, String major) {

		this.setName(name);
		this.setGender(gender);
		this.setAge(age);
		this.setIdNumber(idNumber);
		this.setCgpa(cgpa);
		this.year = year;
		this.major = major;
	}

	public String toString() {
		return "ID : " + getIdNumber() + "\nName : " + getName() + "\nAge : " + getAge() + "\nGender : " + getGender()
				+ "\nMajor : " + getMajor() + "\nCGPA : " + getCgpa() + "\nYear : " + getYear();
	}

}

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Name");
		String name = sc.nextLine();
		System.out.println("Age");
		int age = sc.nextInt();
		System.out.println("Gender");
		char gender = sc.next().charAt(0);
		System.out.println("ID Number");
		long idNumber = sc.nextLong();
		System.out.println("Major");
		String major = sc.next();
		System.out.println("CGPA");
		double cgpa = sc.nextDouble();
		System.out.println("Year");
		int year = sc.nextInt();
		
		System.out.println("The Student details is");
		
		College clg = new College(name, gender, age, idNumber, cgpa, year, major);
	    System.out.println(clg.toString());

	}

}
