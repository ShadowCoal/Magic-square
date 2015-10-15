import java.util.Scanner;
public class FourByFour {
	private static Scanner input;
public static void main(String[]args){
	int[][] numbers = new int [4][4];
	numbers = get();
	int x = 0;
	int row1 = 0;
	int row2 = 0;
	int row3 = 0;
	int row4 = 0;
	int column1 =0;
	int column2 = 0;
	int column3 = 0;
	int column4 = 0;
	int diagonal1 = 0;
	int diagonal2 = 0;
	for ( x = 0; x < 4; x++){
		row1 += numbers[0][x];
		column1 += numbers[x][0];
	}
	for (x = 0; x <4; x ++){
		row2 += numbers[1][x];
		column2 += numbers[x][1];
	}
	for (x = 0; x < 4; x ++){
		row3 += numbers[2][x];
		column3 += numbers[x][2];
	}
	for (x = 0; x < 4; x ++){
		row4 += numbers[3][x];
		column4 += numbers[x][3];
	}
	diagonal1 = numbers[0][0] + numbers[1][1] + numbers[2][2] + numbers[3][3];
	diagonal2 = numbers[0][3] + numbers[1][2] + numbers[2][1] + numbers [3][0];
	if(row1 == row2 && row2 == row3 && row3 == row4)
	{
		if(column1 == column2 && column2 == column3 && column3 == column4)
		{
			if (diagonal1 == diagonal2)
			{
				if (row1 == column1 && column1 == diagonal1)
				{
					for (int y = 0; y < 4; y ++)
					{
						for (x = 0; x <4; x++)
							System.out.print(numbers[y][x] + " ");
						System.out.println(" ");
					}
					
					System.out.println("Is a magic square");
				}
				else
					System.out.println("Is not a magic square");
			}
			else
				System.out.println("Is not a magic square");
		}
		else
			System.out.println("Is not a magic square");
	
	}	
	else
		System.out.println("Is not a magic square");
	
}
public static int[][] get()
{
	input = new Scanner(System.in);
	int[][] numbers = new int [4][4];
	System.out.println("Enter row one seperated by a space ");
	for (int x = 0; x < 4; x++)
		numbers[0][x] = input.nextInt();
	System.out.println("Enter row two the same way ");
	for (int x = 0; x < 4; x++)
		numbers[1][x] = input.nextInt();
	System.out.println("Enter row three the same way ");
	for (int x = 0; x < 4; x++)
		numbers[2][x] = input.nextInt();
	System.out.println("Enter row four the same way ");
	for (int x = 0; x < 4; x++)
		numbers[3][x] = input.nextInt();
	return numbers;
}
}
