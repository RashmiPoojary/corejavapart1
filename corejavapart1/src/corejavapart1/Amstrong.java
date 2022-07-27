package corejavapart1;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		int num = 371, originalNumber, remainder, result = 0;

        originalNumber = num;
		System.out.println("Enter the number to which you need to find the armstro:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
	    System.out.println("Original Number: " + num);
	   
		while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }

	}


