package character;

public class Hero extends CharacterBase {

    // サブクラスのコンストラクタ
    public Hero(String name) {
        super(name);
    }

    // 冒険開始メッセージ
    public void startAdventure() {
        System.out.println("\nさあ冒険に出かけよう！");
    }
}
