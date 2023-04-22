package lesson32person;

    // コンストラクタを作成。
public class Person{
	static int count = 0;
	public String name;
	public int age;
	public double height;
	public double weight;
	
	// Personメソッドに引数を入れてcount++で人数の数を追加。
	public Person(String name, int age, double height, double weight){
		count++;
		this.name   = name;
		this.age    = age;
		this.height = height;
		this.weight = weight;
	}
	
	// 変数bmiにbmiを求める式をリターン分で返す。
	public double bmi(){
		return this.weight / this.height / this.height;
	}
	
	// printメソッドにmainクラスでコンソールに出す文章を記入。
	public void print(){
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}
	
	// printCountメソッドに人数の数を出す文書を記入。
	public static void printCount(){
		System.out.println("合計" + Person.count + "人です");
	}
}