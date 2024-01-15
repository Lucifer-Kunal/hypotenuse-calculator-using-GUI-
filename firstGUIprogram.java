import javax.swing.JOptionPane;
public class firstGUIprogram {

	public static void main(String[] args) {
		int x= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter x"));
		int y= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter y"));
        double z= Math.sqrt((x*x)+(y*y));
        JOptionPane.showMessageDialog(null, "hypotenuse is"+z+"\n please visit again");
	}

}