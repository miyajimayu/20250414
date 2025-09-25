package jp.prefsort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jp.prefdata.Prefecture;

public class Main {
    public static void main(String[] args) {
        // 都道府県データ配列
        Prefecture[] prefectures = {
            new Prefecture("北海道", "札幌市", 83424),
            new Prefecture("青森県", "青森市", 9646),
            new Prefecture("岩手県", "盛岡市", 15275),
            new Prefecture("宮城県", "仙台市", 7282),
            new Prefecture("秋田県", "秋田市", 11638),
            new Prefecture("山形県", "山形市", 9323),
            new Prefecture("福島県", "福島市", 13784),
            new Prefecture("茨城県", "水戸市", 6097),
            new Prefecture("栃木県", "宇都宮市", 6408),
            new Prefecture("群馬県", "前橋市", 6362),
            new Prefecture("埼玉県", "さいたま市", 3798)
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("番号をカンマ区切りで入力してください (例: 8,5,9)");
        String input = sc.nextLine();

        System.out.println("昇順なら asc、降順なら desc を入力してください");
        String order = sc.nextLine();

        // nullチェック
        if (input == null || order == null) {
            System.out.println("入力が無効です。処理を終了します。");
            return;
        }

        // 入力番号を分割
        String[] indices = input.split(",");
        List<Prefecture> selectedList = new ArrayList<>();

        for (String idxStr : indices) {
            try {
                int idx = Integer.parseInt(idxStr.trim());
                if (idx >= 0 && idx < prefectures.length) {
                    selectedList.add(prefectures[idx]);
                } else {
                    System.out.println("番号 " + idx + " は無効です。");
                }
            } catch (NumberFormatException e) {
                System.out.println("入力値が数値ではありません: " + idxStr);
            }
        }

        // ソート
        selectedList.sort((a, b) -> {
            if ("desc".equalsIgnoreCase(order)) {
                return Double.compare(b.getArea(), a.getArea());
            } else {
                return Double.compare(a.getArea(), b.getArea());
            }
        });

        // 出力
        for (Prefecture p : selectedList) {
            System.out.println(p);
        }
    }
}
