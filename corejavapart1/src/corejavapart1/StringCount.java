package corejavapart1;

import java.util.Scanner;

public class StringCount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter your String");
		str=sc.nextLine();
        int count = 1;
        int count_1 = 0; 
        for (int i = 0; i < str.length() - 1; i++)
        {
        	char ch=str.charAt(i);
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            {
                count++;
            }       
        else if(str.charAt(i) != ' ') 
        {   
                count_1++; 
        }
        }
        System.out.println("Number of words in a string : " + count); 
        System.out.println("Total number of characters in a string: " + count_1);    
        System.out.println("Total number of space in a string: " + (count-1));    
    }
	
	
}
