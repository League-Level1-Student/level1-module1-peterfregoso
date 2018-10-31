import javax.swing.JOptionPane;

public class JamesBondRunner {
	public static void main(String[] args) {
		
	
Vault op = new Vault();
String d = JOptionPane.showInputDialog("whats the code");
int a = Integer.parseInt(d);
if(op.tryCode(a)) {
	System.out.println("you opened the vault");
}
else{
	System.out.println("Wrong");
}

}
}