package ch.heigvd.gen.monopoly;

import java.util.ArrayList;
import java.util.List;

public class MonopolyGame {
  private static final int NUMBER_OF_DICE = 2;
  private static final int DEFAULT_NUMBER_PLAYER = 3;
  private static final int NUMBER_OF_ROUNDS = 30;

  private final Board board;
  private final List<Player> players;
  private final Die[] dice;

  private int roundCnt;

  /**
   * Monopoly Game default constructor.
   *
   * <p>If you do not want to specify the number of players, the game will be initialized with the
   * default value</p>
   */
  public MonopolyGame() {
    this(DEFAULT_NUMBER_PLAYER);
  }

  /**
   * Monopoly Game constructor.
   *
   * <p>Will initialize the game</p>
   * @param numOfPlayer The number of players you want in the game
   */
  public MonopolyGame(int numOfPlayer) {
    this.board = new Board();
    this.players = new ArrayList<>();
    this.dice = new Die[NUMBER_OF_DICE];

    for (int i = 0; i < numOfPlayer; i++) {
      this.players.add(new Player());
    }
  }

  /**
   * Launches the game.
   */
  public void playGame() {
    do {
      playRound();
      roundCnt++;
    } while (roundCnt < NUMBER_OF_ROUNDS);
  }

  private void playRound() {

  }

}
