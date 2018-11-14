import javax.swing.JOptionPane;

public class JamesBond {
	JamesBond(){
		
	}
	public int findCode(Vault op) {
		int i = 0;
		boolean foundCode = false;
		for (; i < 1000000; i++) {
			if(op.triedCode(i)) {
				
foundCode= true;
			}
			else {
			
			}
			
		}
	if(foundCode) {
	
		return i;
	}
	else {
		return -1;
	}
	}
	}
