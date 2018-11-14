import javax.swing.JOptionPane;

public class JamesBondRunner {
	public static void main(String[] args) {
		
	
Vault op = new Vault();
JamesBond ok= new JamesBond();
int r =ok.findCode(op);

JOptionPane.showMessageDialog(null, "JAmes bond says the code is" + r);
}
}