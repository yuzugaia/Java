package Chapter2;

// 2.6.2 画面に文字を表示する命令 2-11 改行無し画面出力の命令

public class C2_11{
	public static void main(String[] args) {
		String name = "すがわら";
		System.out.print("私の名前は");		//表示後に改行しない命令
		System.out.print(name);
		System.out.print("です");
	}
}