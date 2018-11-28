import java.util.Random;

import javax.swing.JOptionPane;

public class Vault {
private int code1;


 Vault(){

		Random ran = new Random();
	  code1= ran.nextInt(1000000);


	
}

public boolean triedCode(int triedcode) {
	
	
	if(code1== triedcode) {
		
		return true;
		
	}
	else {
		return false;
	}
	
}
}

