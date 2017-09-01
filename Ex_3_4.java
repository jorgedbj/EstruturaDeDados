// R-3.4 The Tic Tac Toe class of Code Fragments 3.9 and 3.10 has a flaw, in that it allows a player
// to place a mark even after the game has already been won by someone. Modify the class so that the
// putMark method throws an IllegalStateException in that case.

public void putMark(int i, int j) throws IllegalArgumentException {
    if ((i < 0) || (i > 2) || (j < 0) || (j > 2))
      throw new IllegalArgumentException("Invalid board position");
    if (board[i][j] != EMPTY)
      throw new IllegalArgumentException("Board position occupied");
    if (winner() != 0)
    	  throw new IllegalArgumentException("The game already ended");
    board[i][j] = player;       // place the mark for the current player
    player = - player;          // switch players (uses fact that O = - X)
}
