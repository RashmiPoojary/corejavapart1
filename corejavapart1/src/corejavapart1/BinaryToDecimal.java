package corejavapart1;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		String binaryString;  
		System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        binaryString = sc.next();
		int decimal=Integer.parseInt(binaryString,2);  
		System.out.println(decimal);  
	}

}
