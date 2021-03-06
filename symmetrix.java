package myproject;
import java.util.Scanner;

public class symmetric {
	  
	    public static void main(String[] args)
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter the no. of rows : ");
	        int rows = s.nextInt();
	        System.out.println("Enter the no. of columns : ");
	        int cols = s.nextInt();
	        int matrix[][] = new int[rows][cols];
	        System.out.println("Enter the elements :");
	         
	        for (int i = 0; i < rows; i++)
	        {
	            for (int j = 0; j < cols; j++)
	            {
	                matrix[i][j] = s.nextInt();
	            }
	        }
	        System.out.println("input matrix is:");
	         
	        for (int i = 0; i < rows; i++)
	        {
	            for (int j = 0; j < cols; j++)
	            {
	                System.out.print(matrix[i][j]+"\t");
	            }
	             
	            System.out.println();
	        }
	         
	        if(rows != cols)
	        {
	            System.out.println("The given matrix is not a square matrix, so it can't be symmetric.");
	        }
	        else
	        {
	            boolean symmetric = true;
	             
	            for (int i = 0; i < rows; i++)
	            {
	                for (int j = 0; j < cols; j++)
	                {
	                    if(matrix[i][j] != matrix[j][i])
	                    {
	                        symmetric = false;
	                        break;
	                    }
	                }
	            }
	             
	            if(symmetric)
	            {
	                System.out.println("The given matrix is symmetric");
	            }
	            else
	            {
	                System.out.println("The given matrix is not symmetric");
	            }
	        }
	         
	    }
	}
