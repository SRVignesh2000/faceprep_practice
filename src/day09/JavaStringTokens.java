package day09;

import java.util.Scanner;

public class JavaStringTokens {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// input = He is a very very good boy, isn't he?
		
		Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        String text= sentence.trim();
        String []separate= text.split("[ !,?._'@]+");
        if(text.isEmpty())
        System.out.println(0);
        else
        System.out.println(separate.length);
        for (String string : separate) {
            System.out.println(string);
        }
        scan.close();

	}

}
