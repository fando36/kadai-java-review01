package baseball;

public class BaseBallTeam {
    // フィールド（インスタンス変数）
    private String name;
    private int win;
    private int lose;
    private int draw;

    // コンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    // ゲッター
    public String getName() {
        return name;
    }

    public int getWin() {
        return win;
    }

    public int getLose() {
        return lose;
    }

    public int getDraw() {
        return draw;
    }

    // 勝率を計算するメソッド
    public double getRate() {
        int totalGames = win + lose;
        if (totalGames == 0) {
            return 0.0; // 試合数が0の場合、勝率は0
        }
        return (double) win / totalGames;
    }

    // 成績を報告するメソッド
    public void report() {
        System.out.printf("%s の2022年の成績は %d勝 %d敗 %d分、勝率は %.16fです。\n",
                          name, win, lose, draw, getRate());
    }
}
