import javax.swing.JOptionPane;

public class energycalc {
	public static void main(String [] args){
		
		// Set up variables - using Long for easier integer conversion
		Long grains;
		Long velocity;
		Long energy;
		String input;
		
		// Get the first input
		input = JOptionPane.showInputDialog("What is the bullet weight in grains?");
		grains = Long.parseLong(input);
		
		// Get the second input
		input = JOptionPane.showInputDialog("What is the velocity of the round?");
		velocity = Long.parseLong(input);
		
		// Perform calculation and round the number
		// so that conversion to integer is without problems
		energy = Math.round((grains*(Math.pow(velocity, 2)))/(450282));
		int energy2 = energy.intValue(); // convert to int
		
		// Display the result
		JOptionPane.showMessageDialog(null, "The energy of the bullet is "+ energy2 + " ft/lbs");
	}
}
