package ex3b;

import static java.lang.Float.*;

public class MinMaxPlayer extends Player {
    Eval eval;
    int depthLimit;
    Move move;
    
    public MinMaxPlayer(Eval eval, int depthLimit) {//プレイヤー名 評価関数 探索深さ
        super("MinMax"+ depthLimit);
        this.eval = eval;
        this.depthLimit = depthLimit;
    }

    Move search(State state) {
    
}
