package ex3b;

public class RandomPlayer extends Player {
    public RandomPlayer() {
        super("Random");
    }

    Move search(State state) {
        var moves = state.getMoves();
        var index = new java.util.Random().nextInt(moves.size());
        return moves.get(index);
    }
}