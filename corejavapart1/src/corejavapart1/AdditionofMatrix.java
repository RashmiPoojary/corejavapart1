package corejavapart1;

import java.util.Scanner;

public class AdditionofMatrix {

	public static void main(String[] args) {
		{
		      int i, j;
		      int[][] a = new int[2][2];
		      int[][] b = new int[2][2];
		      int[][] c = new int[2][2];
		      
		      Scanner s = new Scanner(System.in);
		      
		      System.out.print("Enter 4 elements for first matrix: ");
		      for(i=0; i<2; i++)
		      {
		         for(j=0; j<2; j++)
		            a[i][j] = s.nextInt();
		      }
		      
		      System.out.print("Enter 4 elements for second matrix: ");
		      for(i=0; i<2; i++)
		      {
		         for(j=0; j<2; j++)
		         {
		            b[i][j] = s.nextInt();
		            c[i][j] = a[i][j] + b[i][j];
		         }
		      }
		      
		      System.out.println("\n1Addition Result");
		      for(i=0; i<2; i++)
		      {
		         for(j=0; j<2; j++)
		            System.out.print(c[i][j]+ " ");
		         System.out.print("\n");
		      }
		   }

	}

}
