import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    public static final int BORDER = 1;

    private ArrayList<Piece> pieces;

    /** Javadoc. */
    public Board() {
        pieces = new ArrayList<Piece>();
    }

    /** Javadoc. */
    public void addPiece(Piece piece) {
        if (!piece.checkPosition(piece.getCoordinatesX(), piece.getCoordinatesY())) {
            return;
        }

        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).getCoordinatesX() == piece.getCoordinatesX()
                    && pieces.get(i).getCoordinatesY() == piece.getCoordinatesY()) {
                return;
            }
        }

        pieces.add(piece);
    }

    /** Javadoc. */
    public boolean validate(int x, int y) {
        if (x < BORDER || x > WIDTH || y < BORDER || y > HEIGHT) {
            return false;
        }
        return true;
    }

    /** Javadoc. */
    public void removeAt(int x, int y) {
        pieces.removeIf(piece -> piece.getCoordinatesX() == x && piece.getCoordinatesY() == y);
    }

    /** Javadoc. */
    public Piece getAt(int x, int y) {
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).getCoordinatesX() == x && pieces.get(i).getCoordinatesY() == y) {
                return pieces.get(i);
            }
        }

        return null;
    }

    /** Javadoc. */
    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    /** Javadoc. */
    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}
