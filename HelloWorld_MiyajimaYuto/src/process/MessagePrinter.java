package process;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MessagePrinter {
    // フィールド変数
    private String greeting;
    private String sushiTaste;
    private String sushiType;
    private String dateTimeMessage;

    // コンストラクタ
    public MessagePrinter() {
        this.greeting = "こんにちは！ここは日本です！";
        this.sushiTaste = "この寿司はうまい";
        this.sushiType = "寿司は和食です";

        // 現在日時を取得
        LocalDateTime now = LocalDateTime.now();
        if (now != null) { // ← nullチェックを追加
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            this.dateTimeMessage = "今の現在日時は" + now.format(formatter) + "です";
        } else {
            this.dateTimeMessage = "現在日時の取得に失敗しました";
        }
    }

    // 出力処理（nullチェック付き）
    public void printMessages() {
        System.out.println(this.greeting != null ? this.greeting : "挨拶が設定されていません");
        System.out.println(this.sushiTaste != null ? this.sushiTaste : "寿司の感想が設定されていません");
        System.out.println(this.sushiType != null ? this.sushiType : "寿司の種類が設定されていません");
        System.out.println(this.dateTimeMessage != null ? this.dateTimeMessage : "日時が設定されていません");
    }
}
