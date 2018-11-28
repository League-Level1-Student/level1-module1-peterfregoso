import java.util.Random;
import java.util.Random;
public class Human {
	private String Gender;
	private boolean alive;
	private String name;
Human(String gender, Boolean alive,String name){
	this.Gender = Gender;
	this.alive = alive;
	this.name = name;
}
public void dance() {
	
	Random ran = new Random();
	int b = ran.nextInt(2);
	if(b == 0) {
		System.out.println(name + " is doing the floss");	
	}
	if(b == 1) {
		System.out.println(name + " is break dancing");	
	}
	if(b == 2) {
		System.out.println(name + " is discoing");	
	}
}
public void kill() {
	
	if(alive) {
		alive = false;
		System.out.println(name + " died");
	}
	else {
		System.out.println("you cannot kill " + name + " because " + name + " is already dead");
	}
	
}
public void payrespects() {
	if(alive) {
		System.out.println("you cannot pay respeects until you kill " + name);
	}
	else {
		System.out.println("f");
	}
}
}
