package corejavapart1;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number: ");
	int n1=sc.nextInt();
	System.out.println("Enter second number: ");
	int n2=sc.nextInt();
	System.out.println("The addition is="+(n1+n2));
	System.out.println("The Substraction is="+(n1-n2));
	System.out.println("The multiplication is="+(n1*n2));
	System.out.println("The division is="+(n1/n2));

	}

}
