import javax.swing.JOptionPane;

public class JOption {
	public static void main (String[] args) {
	
		String num1= JOptionPane.showInputDialog("Enter num");
		int number = Integer.parseInt(num1);
		
		String num2= JOptionPane.showInputDialog("Enter num2");
		int number2= Integer.parseInt(num2);
		
		int total = number + number2 ;
		JOptionPane.showMessageDialog(null, "total ="+ total);
		
		System.exit(0); 
	}

}
