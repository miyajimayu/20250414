package curriculum_1_23;

public class Animal {
    // フィールド
    private String name;
    private Double length;  // double → Double に変更（nullを扱えるようにする）
    private Integer speed;  // int → Integer に変更

    // コンストラクタ
    public Animal(String name, Double length, Integer speed) {
        this.name = name;
        this.length = length;
        this.speed = speed;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    // getter
    public String getName() {
        return this.name;
    }

    public Double getLength() {
        return this.length;
    }

    public Integer getSpeed() {
        return this.speed;
    }

    // 出力用メソッド（nullチェック付き）
    public void printInfo() {
        System.out.println("動物名：" + (this.getName() != null ? this.getName() : "未設定"));
        System.out.println("体長：" + (this.getLength() != null ? this.getLength() + "m" : "未設定"));
        System.out.println("速度：" + (this.getSpeed() != null ? this.getSpeed() + "km/h" : "未設定"));
    }

    // mainメソッド
    public static void main(String[] args) {
        Animal lion = new Animal("ライオン", 2.1, 80);
        lion.printInfo();

        System.out.println("---- nullの例 ----");
        Animal unknown = new Animal(null, null, null);
        unknown.printInfo();
    }
}
