
public class Test {
	public static void main(String[] args) {
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		
		Person ziro = new Person();
		ziro.name = "木村次郎";
		ziro.age = 18;
		
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		
		Person yuki = new Person();
		yuki.name = "吉澤侑希";
		yuki.age = 25;
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		System.out.println(ziro.name);
		System.out.println(ziro.age);
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		
		System.out.println(yuki.name);
		System.out.println(yuki.age);
	}
}
