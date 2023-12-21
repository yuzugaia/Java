package Chapter2;

// 2.2.2 エスケープシーケンス 2-2 エスケープシーケンスを用いていない例(エラー)

public class C2_2 {
	public static void main(String[] args) {
		System.out.println("私の好きな記号は二重引用符（"）です");
					// 2つの二重引用符に囲まれた部分を文字列と解釈される。　）～は文字列としてみなされずエラー
	}
}