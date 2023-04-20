/*
問題1：クラスフィールド「count」を定義してください（初期値：0,データ型：int）

問題2：Personコンストラクタの中でクラスフィールドcountに1を足してください

問題3：Main.javaで System.out.printlnを使い「合計〇〇人です」と出力してください。〇〇はcountの値です。

問題4：クラスメソッド「printCount」を定義してください（データ型：void）

問題5：クラスメソッドの中にクラスフィールド「count」を用いて「合計〇〇人です」と出力してください

問題6：クラスメソッド「printCount」を呼び出してください
*/


package lesson32main;

import lesson32person.Person;

class Main{
	public static void main(String[] argos){
		// インスタンス生成してperson1にPersonクラスの引数の入った物を代入する。
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		// Person1をPersonクラスで作ったprintメソッドを使いコンソールに出力する。
		person1.print();
		// Person1と同様にインスタンス生成してperson2にPersonクラスの引数の入った物を代入する。
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		// Person1をPersonクラスで作ったprintメソッドを使いコンソールに出力する。
		person2.print();
		// Personクラスで作ったprintCountメソッドを使いコンソールに出力する。
		Person.printCount();
	
}
}