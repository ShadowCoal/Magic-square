import javax.swing.JOptionPane;
public class OneToNine {
	public static void main (String[]args)
	{
		int A1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter square A1: "));
		int A2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter square A2: "));
		int A3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter square A3: "));
		int B1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter square B1: "));
		int B2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter square B2: "));
		int B3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter square B3: "));
		int C1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter square C1: "));
		int C2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter square C2: "));
		int C3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter square C3: "));
		int rowA = A1 + A2 + A3;
		int rowB = B1 + B2 + B3;
		int rowC = C1 + C2 + C3;
		int column1 = A1 + B1 + C1;
		int column2 = A2 + B2 + C2;
		int column3 = A3 + B3 + C3;
		int diagonal1 = A1 + B2 + C3;
		int diagonal2 = A3 + B2+ C1;
		int yes = 0;
		if (rowA == 15 && rowB == 15 && rowC == 15)
			if (column1 == 15 && column2 == 15 && column3 == 15)
				if (diagonal1 == 15 && diagonal2 == 15)
					yes = 1;
		if (yes == 1)
			JOptionPane.showMessageDialog(null, A1 + " " + A2 + " " + A3 +"\n" + B1 + " " + B2 + " " + B3 +"\n" + C1 + " " + C2 + " " + C3 + "\nIs a magic square");
		else
			JOptionPane.showMessageDialog(null, "Not a magic square");
}
}
