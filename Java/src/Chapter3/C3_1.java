package Chapter3;

// 3.1.2 分岐を体験する 3-1天気による行動の変化をJavaで表す

public class C3_1{
	public static void main(String[] args) {
		boolean tenki = true;	//条件
		if (tenki == true) {	//trueの場合
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		} else {	//falseの場合
			System.out.println("DVDを見ます");
		}
	}
}