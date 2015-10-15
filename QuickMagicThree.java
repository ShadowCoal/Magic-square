public class QuickMagicThree {
public static void main(String[]args){
	int[][] plot = {{2,0,1},{0,1,2},{1,2,0}};
	int[][] plot2 ={{1,2,0},{0,1,2},{2,0,1}};
	int[][] display = new int[3][3];
	for (int x = 0; x < 3; x ++)
	{
		for (int y = 0; y < 3; y ++)
		{
			display[x][y] = 3*plot[x][y] + plot2[x][y] +1;
			System.out.print(display[x][y] + " ");
		}
		System.out.println();
	}
}
}
