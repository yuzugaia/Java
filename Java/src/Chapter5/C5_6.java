package Chapter5;
//5.2.5変数のスコープとローカル変数 5-6引数を使わずに値を渡せないのか？(エラー)
public class C5_6{
	public static void main(String[] args) {
		int x = 100;
		int y = 10;	//addメソッドで使用するつもり
		add();	//addメソッドを呼び出す
	}
	public static void add() {
		int ans = x + y;	//ここで使用するつもり(エラー)
		System.out.println(x + "+" + y + "=" + ans);
	}
}

//mainメソッド内で宣言した変数はmainメソッドのブロック内でした使用できないためエラー