public class Rook extends Piece {

    /** Javadoc. */
    public Rook() {
        super();
    }

    /** Javadoc. */
    public Rook(int x, int y) {
        super(x, y);
    }

    /** Javadoc. */
    public Rook(int x, int y, String color) {
        super(x, y, color);
    }

    /** Javadoc. */
    public String getSymbol() {
        return "R";
    }

    /** Javadoc. */
    public boolean canMove(Board board, int x, int y) {
        if (!checkPosition(x, y)) {
            return false;
        }

        if (board.getAt(x, y) != null && board.getAt(x, y).getColor().equals(getColor())) {
            return false;
        }

        if (getCoordinatesX() == x && getCoordinatesY() != y) {
            int min = Math.min(getCoordinatesY(), y);
            int max = Math.max(getCoordinatesY(), y);
            for (int i = min + 1; i < max; i++) {
                if (board.getAt(x, i) != null) {
                    return false;
                }
            }
        } else if (getCoordinatesX() != x && getCoordinatesY() == y) {
            int min = Math.min(getCoordinatesX(), x);
            int max = Math.max(getCoordinatesX(), x);
            for (int i = min + 1; i < max; i++) {
                if (board.getAt(i, y) != null) {
                    return false;
                }
            }
        } else if (getCoordinatesX() != x && getCoordinatesY() != y) {
            return false;
        }

        return true;
    }
}
