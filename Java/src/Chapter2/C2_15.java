package Chapter2;

// 2.6.6 キーボードから1行の入力を受け取る命令

public class C2_15{
	public static void main(String[] args) {
		System.out.println("あなたの名前を入力してください。");		//1行の文字列の入力を受け付ける
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		int age = new java.util.Scanner(System.in).nextInt();		//1行の整数の入力を受け付ける
		System.out.println("ようこそ、" + age + "歳の" + name + "さん" );
	}
}