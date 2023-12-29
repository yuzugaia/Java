package Chapter3;

// 3.1.3 繰り返しを体験する 3-2 トイレの空きを待つ繰り返し処理

public class C3_2{
	public static void main(String[] args) {
		boolean doorClose = true;	//条件
		while (doorClose == true) {
			System.out.println("ノックする");
			System.out.println("1分待つ");
		}
	}
}

// 7行目がtrueの場合、プログラムを実行すると無限ループする。