package corejavapart1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int num, reversed = 0;
		System.out.println("Enter the number to which you need to find the Palindrome:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
	    System.out.println("Original Number: " + num);
	    int temp=num;
	    while(num != 0) 
	    {
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;
	      num /= 10;

	}
	    if(reversed == temp)
            System.out.println(temp + " is an Palindrome number.");
        else
            System.out.println(temp + " is not an Palindrome number.");
    }
}
