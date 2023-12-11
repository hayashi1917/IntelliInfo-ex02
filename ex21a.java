package ex3a;

import java.util.*;

class Stage{//マップを作成
    static Map<String,List<String>> childNodeLists = Mao.of(
        "A", List.of("B","C"),
        "B", List.of("D","E"),
        "C", List.of("F","G"));
    static Map<String,Float> values = Map.of(
        "D", 3.0f,
        "E", 2.0f,
        "F", 1.0f,
        "G", 4.0f);

    String current;

    Stage(string current){//現在のノードを設定
        this.current = current;
    }

    public String toString(){//オーバーライドさせる
        return this.current.toString();
    }

    boolean isGoal(){//ゴールかどうか判定
        return getMove().isEmpty();
    }
    
    List<Stage> getMove(){//次のノードを取得
        return Stage.childNodeLists.getOrDefault(this.current, new  ArrayList<>());
    }

    Stage perform(String move){//次のノードを設定し、移動する
        return new Stage(move);
    }
}

class Eval {//評価値を計算する
    float value(Stage state){
        return State.values.getOrDefault(state.current, Float.NaN);
    }
}//時間45分