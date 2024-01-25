package ex3a;

import static ex3b.Color.*;
import java.util.*;
import java.util.stream.*;

public class State implements Cloneable {
    int numStones;
    Color color = BLACK;
    Move move;

    public State(int numStones) {
        this.numStones = numStones;
    }

    public State clone(){
        State other  = new State(this.numStones);
        other.color = this.color;
        other.move = this.move;
        return other;
    }

    public List<Move> getMoves() {
        var n = Math.min(3, this.numStones);
        return IntStream.rangeClosed(1,n).mapToObj(i -> new Move(i, this.color)).toList();
    }

    public State perform(Move move) {
        var next = clone();
        next.numStones -= move.removal;
        next.color = next.color.flipped();
        next.move = move;
        return next;
    }
}