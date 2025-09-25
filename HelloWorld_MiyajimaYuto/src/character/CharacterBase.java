package character;

import java.util.Random;

public class CharacterBase {
    private String name;
    private int hp;
    private int mp;
    private int attack;
    private int speed;
    private int defense;

    // コンストラクタ
    public CharacterBase(String name) {
        if (name == null) {
            throw new IllegalArgumentException("名前がNullです。処理を中止します。");
        }
        this.name = name;
        setRandomStatus();
    }

    // ランダムステータス生成
    protected void setRandomStatus() {
        Random rand = new Random();
        this.hp = rand.nextInt(1000) + 1;
        this.mp = rand.nextInt(1000) + 1;
        this.attack = rand.nextInt(500) + 1;
        this.speed = rand.nextInt(1000) + 1;
        this.defense = rand.nextInt(100) + 1;
    }

    // Getter / Setter
    public String getName() { return name; }
    public void setName(String name) { 
        if (name == null) {
            throw new IllegalArgumentException("名前がNullです。処理を中止します。");
        }
        this.name = name; 
    }

    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = hp; }

    public int getMp() { return mp; }
    public void setMp(int mp) { this.mp = mp; }

    public int getAttack() { return attack; }
    public void setAttack(int attack) { this.attack = attack; }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    public int getDefense() { return defense; }
    public void setDefense(int defense) { this.defense = defense; }

    // ステータス表示
    public void showStatus() {
        System.out.println("こんにちは 「 " + name + " 」 さん");
        System.out.println("ステータス");
        System.out.println("HP：" + hp);
        System.out.println("MP：" + mp);
        System.out.println("攻撃力：" + attack);
        System.out.println("素早さ：" + speed);
        System.out.println("防御力：" + defense);
    }
}
