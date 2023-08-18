package day27;

import java.util.Scanner;

abstract class Methods{
	public abstract void rectangle(int num);
  	public abstract void circle(int num);
}

class Rectangle extends Methods {
  public void rectangle(int num){
    System.out.println("Rectangle");
     System.out.println("The given input is "+num);
  }
    public void circle(int num){
    System.out.println("Circle");
     System.out.println("The given input is "+num);
  }
}

public class RectangleAndSquare {
	
	public static void main(String args[])
	  {
		Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    Rectangle rec = new Rectangle();
	    rec.rectangle(num);
	    rec.circle(num);
	  }

}
