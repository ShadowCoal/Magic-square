import java.util.Scanner;
public class GoldenRectangle {
	private static Scanner input;
	public static void main(String[]args){
		input = new Scanner(System.in);
		int x = 1, y = 1;
		int z = 0;
		int far = 0;
		System.out.print("Input how far you want to go ");
		far = input.nextInt();
		System.out.print("1, 1 ");
		for (int i = 2; i <=far; i++){
			z = x + y;
			System.out.print(", " + z);
			y = x;
			x = z;
		}
	}
}
