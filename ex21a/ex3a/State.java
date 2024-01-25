package ex3a;

import java.util.*;

class State{//マップを作成
    static Map<String,List<String>> childNodeLists = Map.of(
        "A", List.of("B","C"),
        "B", List.of("D","E"),
        "C", List.of("F","G"));
    static Map<String,Float> values = Map.of(
        "D", 3.0f,
        "E", 2.0f,
        "F", 1.0f,
        "G", 4.0f);

    String current;

    State(String current){//現在のノードを設定
        this.current = current;
    }

    public String toString(){//オーバーライドさせる
        return this.current.toString();
    }

    boolean isGoal(){//ゴールかどうか判定
        return getMoves().isEmpty();
    }
    
    List<String> getMoves(){//次のノードを取得
        return State.childNodeLists.getOrDefault(this.current, new  ArrayList<>());
    }

    State perform(String move){//次のノードを設定し、移動する
        return new State(move);
    }
}

class Eval {//評価値を計算する
    float value(State state){
        return State.values.getOrDefault(state.current, Float.NaN);
    }
}//時間45分