package sudoku;

import java.util.Scanner;


public class SudokuChecker
{
	private static final int  GRID_SIZE = 9;
	static int[][] board = 
	{
			{7, 0, 2, 0, 5, 0, 6, 0, 0},
			{0, 0, 0, 0, 0, 3, 0, 0, 0},
			{1, 0, 0, 0, 0, 9, 5, 0, 0},
			{8, 0, 0, 0, 0, 0, 0, 9, 0},
			{0, 4, 3, 0, 0, 0, 7, 5, 0},
			{0, 9, 0, 0, 0, 0, 0, 0, 8},
			{0, 0, 9, 7, 0, 0, 0, 0, 5},
			{0, 0, 0, 2, 0, 0, 0, 0, 0},
			{0, 0, 7, 0, 4, 0, 2, 0, 3}
			
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
		
		
		check.isNumberInRow(board, number, row);
		
		check.isNumberInColumn(board, number, column);
		
		
	}
	
	 //method finds out if input number is found in the specified row
	 boolean isNumberInRow(int[][] board, int number, int row)
	{
		for(int i = 0 ; i < GRID_SIZE; i++)
		{
			if(board[row][i] == number) 
			{
				System.out.println("true");
				return true; 
				
			}
		}
			System.out.println("false");
			return false;
	}
	
	 
	 //method finds out if input number is found in the specified column
	 boolean isNumberInColumn(int[][] board, int number, int column)
		{
			for(int i = 0 ; i < GRID_SIZE; i++)
			{
				if(board[i][column] == number) 
				{
					System.out.println("true");
					return true; 
					
				}
			}
				System.out.println("false");
				return false;
		}
	 
}
