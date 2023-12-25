package Chapter2;

// 2.6.4 文字列を数値に変換する命令 2-13 String型をint型に変換する命令

public class C2_13{
	public static void main(String[] args) {
		String age = "31";
		int n = Integer.parseInt(age);		//文字列の31を数値に変換
		System.out.println("あなたは来年、" + (n+1) + "歳になりますね。");
	}
}