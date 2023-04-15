package person_30;

import bicycle_31.Bicycle;
import car_31.Car;
    //コントラスタを定義。
public class Person{
	static int count = 0;
	public String name;
	int age;
	double height;
	double weight;
	double bmi;
	// コンストラクタを定義しインスタンスフィールドに値をセット。count++でそれぞれの人の数を計算。この問題の場合2人と出力される。
	public Person(String name,int age, double height,double weight){
		Person.count++;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	//BMIを計算する式を入力し変数bmiにreturnする。
	public double bmi() {
		return  this.weight / this.height / this.height ;
	}
	//コンソールに出力する文章の型を定義。
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("BMI" + this.bmi() + "です");
		System.out.println("年は" + this.age + "です");
	}
	//buyメソッドにCarクラスのオーナーを定義。コンソールに出力する文章を定義。
	public void buy(Car car) {
		car.setOwner(this.name);
		System.out.println(car.getOwner() + "が購入しました");
	}
	//Carクラスと同じくbuyメソッドにbicicleオーナーを定義。コンソールに出力する文章を定義。
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.name);
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}