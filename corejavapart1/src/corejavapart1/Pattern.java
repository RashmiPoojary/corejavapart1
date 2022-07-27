package corejavapart1;

public class Pattern {

	public static void main(String[] args)
	{ 
			int i, j,row=5;  
			
			/*
			  int row=5;
			  for(i=0; i<row; i++)   
			{   
			for(j=0; j<=i; j++)   
			{  
			System.out.print("* ");   
			}
			System.out.println();   
			} */  
	   
			//RIGHT TRIANGLE
			/*int size=5;
			for(i=0;i<size;i++)
			{
				for(j=1;j<size-i;j++)
				{
					System.out.print(" "); 
				}
					for(int k=0;k<=i;k++)
					{
						System.out.print("*"); 
					}
					System.out.println();  
			}*/
			     
			 //SIMPLE TRIANGLE
			for (i=0; i<row; i++)   
			{     
			for (j=row-i; j>1; j--)   
			{ 
			System.out.print(" ");   
			}
			for (j=0; j<=i; j++ )   
			{     
			System.out.print("* ");   
			}     
			System.out.println();   
			}   
		}   
			
	}

