package lesson23_2;

import lesson1_23.C23;

public class Lesson23_2 {

	public static void main(String[] args) {
		C23 lion = new C23();
		lion.setName("ライオン");
		lion.setBodyLength(2.1);
		lion.setSpeed(80);

		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getBodyLength() + "m");
		System.out.println("速度：" + lion.getSpeed() + "km/h");
	}
}
