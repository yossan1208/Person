
public class Robot {
	public String name = null;
	
	public void talk() {
		System.out.println(this.name + "は話せません。");
	}
	public void walk() {
		System.out.println(this.name + "は歩きました。");
	}
	public void run() {
		System.out.println(this.name + "は走ります。");
	}
}
