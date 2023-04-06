package lesson1_22_2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsoleLogic {
	private String greeting = "こんにちは！ここは日本です！";
	private String name = "寿司";
	private String datetime;
	
	public ConsoleLogic() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        this.datetime = "今の現在日時は" + now.format(formatter) + "です";
    }
	public void printOutput() {
        System.out.println(this.greeting);
        System.out.println("この" + name + "はうまい");
        System.out.println( name + "は和食です");
        System.out.println(this.datetime);
    }
	
}
