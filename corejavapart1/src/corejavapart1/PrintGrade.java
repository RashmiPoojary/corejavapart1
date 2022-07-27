package corejavapart1;

import java.util.Scanner;

public class PrintGrade {

	public static void main(String[] args) {
		int a, b, c,avg;
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter marks of english marks:");  
		a = sc.nextInt();  
		System.out.println("Enter marks of maths marks:");  
		b = sc.nextInt();  
		System.out.println("Enter marks of science marks:");  
		c = sc.nextInt();
		avg=(a+b+c)/3;
		System.out.println("Average is"+avg);
		if(avg>80 && avg<=100) {
			System.out.println("A GRADE");
		}
		else if(avg>60 && avg<=80) {
			System.out.println("B GRADE");
		}
		else if(avg>40 && avg<=60) {
			System.out.println("C GRADE");
		}
		else {
			System.out.println("FAIL");
		}
			
		}
	}


