package Chapter2;

// 2.6.4 乱数を生み出して代入する命令 2-14 ランダムな数を生成する命令

public class C2_14{
	public static void main(String[] args) {
		int r = new java.util.Random().nextInt(90);	//0~89の数値がランダムで代入される
		System.out.println("あなたはたぶん" + r + "歳ですね？");
	}
}