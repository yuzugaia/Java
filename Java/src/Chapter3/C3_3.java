package Chapter3;

//3.2.1 ブロックとは 3-3 波かっこを省略した記述

public class C3_3{
	public static void main(String[] args) {
		boolean tenki = true;	//条件
		if (tenki == true) {	//内容が2行のため省略不可能
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		} else	//内容が1行であるため省略可能
			System.out.println("DVDを見ます");
	}
}