package Chapter3;

//3.6.1 制御構造のネスト 3-9 for文のループを二重にして九九の票を出力させる

public class C3_9{
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {		//1~9までの繰り返し
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j);	//掛け算の結果
				System.out.print(" ");		//空白を出力
			}
			System.out.println("");		//改行を出力
		}
	}
}