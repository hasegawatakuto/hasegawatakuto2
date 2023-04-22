package lesson33person;

    // コンストラクタを作成。
public class Person{
	public static int count = 0;
	public String firstName;
	public String lastName;
	public int age;
	public double height, weight;
	
	// Personメソッドに引数を入れてcount++で人数の数を追加。
	public Person(String firstName, String lastName, int age, double height, double weight){
		count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// 変数fullNameにfirstNameとlastNameを足した物をリターン分で返す。
	public String fullName(){
		return this.firstName + this.lastName;
	}
	
	// printメソッドにコンソールで出力する文を記入。
	public void print(){
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}
	
	// 変数bmiにbmiを計算する式をリターンで返す。
	public double bmi(){
		return this.weight / this.height / this.height;
	}
	
	// printCountメソッドに人数の数を出す文書を記入。
	public static void printCount(){
		System.out.println("合計" + count + "人です");
	}
}