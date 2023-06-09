package basicClass;

public class Dog {
    // Q1：フィールドに動物の名前の変数を定義してください。
    private String name;

    // Q2：フィールドに動物の数の変数を定義してください。
    private static int count = 0;

    // Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
    public Dog() {
        this.name = "犬";
        count++;
    }

    // Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
    public Dog(String name) {
        this.name = name;
        count++;
    }
    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }
}