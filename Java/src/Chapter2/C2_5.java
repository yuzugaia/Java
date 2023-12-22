package Chapter2;

// 2.5.2 代入時の自動型変換 2-5値より大きな型の変数に代入

public class C2_5{
	public static void main(String[] args) {
		float f = 3;	//float(小数)型の変数にint(整数)型を代入
		double d = f;	//double(小数)型の変数にfloat(小数)型を代入
		System.out.println(f);
		System.out.println(d);
	}
}