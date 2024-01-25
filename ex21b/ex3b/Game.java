package ex3b;
import static ex3b.Color.*;
import java.util.*;


public class Game {
    public static void main(String[] args) {
        for(int numStones = 1; numStones <= 20; numStones++){
            var p0 = new RandomPlayer();
            var p1 = new MinMaxPlayer(new Eval(), 20);
            Game g = new Game(numStones, p0, p1);
            g.play();
            g.printResult();
        }
    }

    public Game(int numStones, Player black, Player white) {
        this.numStones = numStones;
        this.players = new Player[]{black, white};
        this.board = new Board(numStones);
    }

    void play() {
        System.out.println("==== %d stones(s) ===\n, state.numStones");

        while(this.state.isGoal() == false) {
            var player = this.players.get(this.state.slone());
            var next = this.state.perform(move);
            System.out.printf("");
        }
    }
    void printResult() {//結果の表示
        System.out.println("Winner: " + this.players.get(this.state.winner()));
        System.out.println();
    }
}
