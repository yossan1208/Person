
public class Test {
	public static void main(String[] args) {
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "000-0000-0000";
		taro.address = "東京都";
		
		Person ziro = new Person();
		ziro.name = "木村次郎";
		ziro.age = 18;
		ziro.phoneNumber = "111-1111-1111";
		ziro.address = "京都府";
		
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "222-2222-2222";
		hanako.address = "愛知県";
		
		Person yuki = new Person();
		yuki.name = "吉澤侑希";
		yuki.age = 25;
		yuki.phoneNumber = "333-3333-3333";
		yuki.address = "大阪府";
		
		Robot aibo = new Robot();
		aibo.name = "アイボ";
		
		Robot asimo = new Robot();
		asimo.name = "アシモ";
		
		Robot pepper = new Robot();
		pepper.name = "ペッパー";
		
//		出力
//		---------------------------------
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		System.out.println();
		
		System.out.println(ziro.name);
		System.out.println(ziro.age);
		System.out.println(ziro.phoneNumber);
		System.out.println(ziro.address);
		ziro.talk();
		ziro.walk();
		ziro.run();
		System.out.println();
		
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();
		System.out.println();
		
		System.out.println(yuki.name);
		System.out.println(yuki.age);
		System.out.println(yuki.phoneNumber);
		System.out.println(yuki.address);
		yuki.talk();
		yuki.walk();
		yuki.run();
		System.out.println();
		
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();
		System.out.println();
		
		System.out.println(asimo.name);
		asimo.talk();
		asimo.walk();
		asimo.run();
		System.out.println();
		
		System.out.println(pepper.name);
		pepper.talk();
		pepper.walk();
		pepper.run();
		System.out.println();
		}
}
