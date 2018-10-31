import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String mm = JOptionPane.showInputDialog("what flavor popcorn would you like");
	String time = JOptionPane.showInputDialog("how long would you like to cook the popcorn");
	int o = Integer.parseInt(time);
	Popcorn op = new Popcorn(mm);
	Microwave po = new Microwave();
	po.putInMicrowave(op);
	po.setTime(o);
	po.startMicrowave();
}
}
