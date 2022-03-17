package abc1;

import java.lang.String;
import java.util.Scanner;

public class Test {
public static void main(String []args) {
	System.out.println("Hello World!!");
	System.out.println("are you hungry");
	Scanner scan=new Scanner(System.in);
	String input=scan.nextLine();
	if(input.equalsIgnoreCase("yes")) {
		System.out.println("eat samosa");
	}
	else {
		System.out.println("do yourn work");
	}
	
}
}