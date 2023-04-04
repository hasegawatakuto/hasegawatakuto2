package person_30;

import bicycle_31.Bicycle;
import car_31.Car;

public class Person{
	static int count = 0;
	public String name;
	int age;
	double height;
	double weight;
    double bmi;
	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name,int age, double height,double weight){
		Person.count++;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public double bmi() {
		return  this.weight / this.height / this.height ;
	}
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("BMI" + this.bmi() + "です");
		System.out.println("年は" + this.age + "です");
	}
	public void buy(Car car) {
		car.setOwner(this.name);
		System.out.println(car.getOwner() + "が購入しました");
		}

		public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.name);
		System.out.println(bicycle.getOwner() + "が購入しました");
		}
}