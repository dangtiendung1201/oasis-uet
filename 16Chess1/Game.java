import java.util.ArrayList;

public class Game {
    private Board board;
    private static ArrayList<Move> moveHistory;

    /** Javadoc. */
    public Game() {
        board = new Board();
        moveHistory = new ArrayList<Move>();
    }

    /** Javadoc. */
    public Game(Board board) {
        this.board = board;
        moveHistory = new ArrayList<Move>();
    }

    /** Javadoc. */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            Move move = new Move(piece.getCoordinatesX(), piece.getCoordinatesY(),
                    x, y, piece, board.getAt(x, y));

            moveHistory.add(move);

            board.removeAt(x, y);

            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
        }
    }

    /** Javadoc. */
    public Board getBoard() {
        return board;
    }

    /** Javadoc. */
    public void setBoard(Board board) {
        this.board = board;
    }

    /** Javadoc. */
    public static ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }
}
