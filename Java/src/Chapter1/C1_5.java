package Chapter1;

// 1.3.5 定数の利用 1-5 円周率に定数を利用する

public class C1_5 {
	public static void main (String[] args) {
		final double PI = 3.14;		//finalを記述し、｢定数｣として宣言
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
		System.out.println("パイの半径を倍にします");
		//PI = 10;	初期値を代入後、値を書き換えることができなくなるためエラーがでる
		pie = 10;	//修正後
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
	}
}