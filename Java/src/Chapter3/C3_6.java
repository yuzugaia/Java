package Chapter3;

//3.4.3 break文を書き忘れると？ 3-6 あえてbreak文を書かない

public class C3_6{
	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch (fortune) {		// ↑1~5の乱数発生
			case 1:
			case 2:
				System.out.println("いいね！");
				break;
			case 3:
				System.out.println("普通です");
				break;
			case 4:
			case 5:
				System.out.println("うーん…");
		}
	}
}