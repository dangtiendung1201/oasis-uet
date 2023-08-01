public class Rook extends Piece {
    public Rook(int x, int y) {
        super(x, y);
    }

    public Rook(int x, int y, String color) {
        super(x, y, color);
    }

    public String getSymbol() {
        return "R";
    }

    public boolean canMove(Board board, int x, int y) {
        if (!super.checkPosition(x, y)) {
            return false;
        }

        if (board.getAt(x, y) != null && board.getAt(x, y).getColor().equals(super.getColor())) {
            return false;
        }

        if (super.getCoordinatesX() == x && super.getCoordinatesY() != y) {
            int min = Math.min(super.getCoordinatesY(), y);
            int max = Math.max(super.getCoordinatesY(), y);
            for (int i = min + 1; i < max; i++) {
                if (board.getAt(x, i) != null) {
                    return false;
                }
            }
        } else if (super.getCoordinatesX() != x && super.getCoordinatesY() == y) {
            int min = Math.min(super.getCoordinatesX(), x);
            int max = Math.max(super.getCoordinatesX(), x);
            for (int i = min + 1; i < max; i++) {
                if (board.getAt(i, y) != null) {
                    return false;
                }
            }
        } else if (super.getCoordinatesX() != x && super.getCoordinatesY() != y) {
            return false;
        }

        return true;
    }
}
