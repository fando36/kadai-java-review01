public class Review01 {
    // 税率を定義
    private static final double TAX_RATE = 0.10; // 10%の消費税率

    public static void main(String[] args) {
        int productPrice = 1500; // 商品価格
        int taxAmount = tax(productPrice); // 消費税額を取得

        // 税込価格を計算
        int totalPrice = productPrice + taxAmount;

        // 結果を表示
        System.out.println(productPrice + "円の商品の税込価格は" + totalPrice + "円（消費税は" + taxAmount + "円）です。");
    }

    // taxメソッド：消費税額を計算して戻す
    public static int tax(int price) {
        // 税額を計算（消費税率を乗算して小数点以下を切り捨て）
        return (int) (price * TAX_RATE); // キャストで小数点以下を切り捨て
    }
}