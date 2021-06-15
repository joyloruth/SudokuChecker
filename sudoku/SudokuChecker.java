package sudoku;

import java.util.Scanner;


public class SudokuChecker
{
	private static final int  GRID_SIZE = 9;
	static int[][] panel = 
	{
			{7, 0, 2,   0, 5, 0,   6, 0, 0},
			{0, 0, 0,   0, 0, 3,   0, 0, 0},
			{1, 0, 0,   0, 0, 9,   5, 0, 0},
		    
			{8, 0, 0,   0, 0, 0,   0, 9, 0},
			{0, 4, 3,   0, 0, 0,   7, 5, 0},
			{0, 9, 0,   0, 0, 0,   0, 0, 8},
			
			{0, 0, 9,   7, 0, 0,   0, 0, 5},
			{0, 0, 0,   2, 0, 0,   0, 0, 0},
			{0, 0, 7,   0, 4, 0,   2, 0, 3}
			
	};

	public static void main(String[] args)
	
	{
		
		SudokuChecker check = new SudokuChecker();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter row number.");
		int row = scan.nextInt();
		
		System.out.println("Enter column number.");
		int column = scan.nextInt();
		
		System.out.println("Enter number in row you want to find.");
		int number = scan.nextInt();
		
		
		check.isNumberInRow(panel, number, row);
		
		check.isNumberInColumn(panel, number, column);
		
		check.isNumberInCube(panel, number, row, column);
		
		
				
		
	}
	
	
	
	 //method finds out if input number is found in the specified row
	 boolean isNumberInRow(int[][] panel, int number, int row)
	{
		for(int i = 0 ; i < GRID_SIZE; i++)
		{
			if(panel[row][i] == number) 
			{
				System.out.println("true");
				return true; 
				
			}
		}
			System.out.println("false");
			return false;
	}
	
	 
	 
	 
	 //method finds out if input number is found in the specified column
	 boolean isNumberInColumn(int[][] panel, int number, int column)
	{
			for(int i = 0 ; i < GRID_SIZE; i++)
			{
				if(panel[i][column] == number) 
				{
					System.out.println("true");
					return true; 
					
				}
			}
				System.out.println("false");
				return false;
	}
	 
	 
	//method finds out if input number is found in the specified 3 X 3 cube
		 boolean isNumberInCube(int[][] panel, int number, int row, int column)
		{
			 int currentCubeRow = row - row%3;
			 int currentCubeColumn = column - column%3;
			 
			 for(int i = currentCubeRow; i < currentCubeRow + 3; i++) 
			 {
				for(int k = currentCubeColumn; k < currentCubeRow + 3; k++) 
				{
					 
					if(panel[i][k] == number) 
					{
						System.out.println("true");
						return true;
					}
				}
			 }
			 
			 System.out.println("false");
			 return false;
		}
			 
	 
			
}


