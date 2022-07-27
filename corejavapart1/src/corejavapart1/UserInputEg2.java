package corejavapart1;

import java.util.Scanner;

public class UserInputEg2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Insert a number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Text1: ");
		String text1 = sc.nextLine();
		System.out.print("Text2: ");
		String text2 = sc.nextLine();
		System.out.println("number is:"+number);
		System.out.println("number is:"+text1);
		System.out.println("number is:"+text2);
	}

}
