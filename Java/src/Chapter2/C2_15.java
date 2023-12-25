package Chapter2;

// 2.6.6 キーボードから1行の入力を受け取る命令

public class C2_15{
	public static void main(String[] args) {
		System.out.println("あなたの名前を入力してください。");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ、" + age + "歳の" + name + "さん" );
	}
}