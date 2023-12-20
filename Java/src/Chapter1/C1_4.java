package Chapter1;

// 1.3.5 定数の利用 1-4 書き換えてはいけない変数の値を上書き

public class C1_4 {
	public static void main (String[] args) {
		double pi = 3.14;	//円周率を入れた変数
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * pi);
		System.out.println("パイの半径を倍にします");
		pi = 10;	//本来は｢pie｣に代入するべき
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * pi);
	}
}