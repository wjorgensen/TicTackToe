package xogame;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.time.*;
public class game {
	//Array of the game board
	public static int[] board = new int[9];
	public static int pCharecter = 0;
	
	public static void main(String args[]) throws InterruptedException
	{
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Welcome to tic tak toe!");
		System.out.print("Play as \"X\" or \"O\"?_ ");
		//Select X or O logic
		String xo = scan.nextLine();
		if(xo.equals("X") || xo.equals("x"))
		{
			pCharecter = 0;
		}
		else if(xo.equals("O") || xo.equals("o"))
		{
			pCharecter = 1;
		}
		else
		{
			System.out.println("Playing as default X");
		}
		//First turn sequence
		System.out.println(" 1 | 2 | 3 \n-----------\n 4 | 5 | 6 \n-----------\n 7 | 8 | 9");
		System.out.print("What's your first move? (1-9)_ ");
		int firstPlay = scan.nextInt();
		updateBoard(firstPlay);
		System.out.println("Computer's Turn");
		computersPlay();
		Thread.sleep(2000);
		printBoard();
		//Loop for rest of game
		for(int x = 0; x<9; x+=2)
		{
			System.out.print("\nNext move? (1-9)_");
			int play = scan.nextInt();
			updateBoard(play);	
			System.out.println("Computer's Turn");
			computersPlay();
			Thread.sleep(2000);
			printBoard();
			
		}
		
		
		
	}
	
	//Method for printing out the board as the game goes on
	public static void printBoard()
	{
		for(int x = 1; x<10; x++)
		{
			switch(x) {
			case 1:
				if(board[x-1] == 0)
				{
					System.out.print("\n   |");
				}
				else if(board[x-1]==1)
				{
					System.out.print("\n x |");
				}
				else
				{
					System.out.print("\n O |");
				}
				break;
			case 2:
				if(board[x-1] == 0)
				{
					System.out.print("   |");
				}
				else if(board[x-1]==1)
				{
					System.out.print(" x |");
				}
				else
				{
					System.out.print(" O |");
				}
				break;
			case 3:
				if(board[x-1] == 0)
				{
					System.out.print("   ");
				}
				else if(board[x-1]==1)
				{
					System.out.print(" x ");
				}
				else
				{
					System.out.print(" O ");
				}
				System.out.print("\n");
				for(int a = 0; a<11; a++)
				{
					System.out.print("-");
				}
				System.out.print("\n");
				break;
			case 4:
				if(board[x-1] == 0)
				{
					System.out.print("   |");
				}
				else if(board[x-1]==1)
				{
					System.out.print(" x |");
				}
				else
				{
					System.out.print(" O |");
				}
				break;
			case 5:
				if(board[x-1] == 0)
				{
					System.out.print("   |");
				}
				else if(board[x-1]==1)
				{
					System.out.print(" x |");
				}
				else
				{
					System.out.print(" O |");
				}
				break;
			case 6:
				if(board[x-1] == 0)
				{
					System.out.print("   ");
				}
				else if(board[x-1]==1)
				{
					System.out.print(" x ");
				}
				else
				{
					System.out.print(" O ");
				}
				System.out.print("\n");
				for(int b = 0; b<11; b++)
				{
					System.out.print("-");
				}
				System.out.print("\n");
				break;
			case 7:
				if(board[x-1] == 0)
				{
					System.out.print("   |");
				}
				else if(board[x-1]==1)
				{
					System.out.print(" x |");
				}
				else
				{
					System.out.print(" O |");
				}
				break;
			case 8:
				if(board[x-1] == 0)
				{
					System.out.print("   |");
				}
				else if(board[x-1]==1)
				{
					System.out.print(" x |");
				}
				else
				{
					System.out.print(" O |");
				}
				break;
			case 9:
				if(board[x-1] == 0)
				{
					System.out.print("   \n");
				}
				else if(board[x-1]==1)
				{
					System.out.print(" x \n");
				}
				else
				{
					System.out.print(" O \n");
				}
				break;
			}
		}
	}
	
	//Method for updating the array
	public static void updateBoard(int play)
	{
		switch(pCharecter)
		{
		case 0:
			board[play-1] = 1;
			break;
		case 1:
			board[play-1] = 2;
			break;
		}
	}
	
	//Method that determines computers play
	public static void computersPlay()
	{
		//Generates random square
		int rand = (int)((Math.random()*9)+1);
		//makes sure that square is free
		do
		{
			rand = (int)((Math.random()*9)+1);
		}while(!(board[rand-1]==0));
		
		if(pCharecter == 0)
		{
			board[rand-1] = 2;
		}
		else
		{
			board[rand-1] = 1;
		}
		
	}
		
	
}
