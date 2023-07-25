import java.lang.reflect.Array;
import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;

    private ArrayList<Piece> pieces;

    public Board() {
        pieces = new ArrayList<Piece>();
    }

    public void addPiece(Piece piece) {
        if (!piece.checkPosition(piece.getCoordinatesX(), piece.getCoordinatesY())) {
            throw new IllegalArgumentException("Invalid coordinates");
        }

        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).getCoordinatesX() == piece.getCoordinatesX()
                    && pieces.get(i).getCoordinatesY() == piece.getCoordinatesY()) {
                return;
                // throw new IllegalArgumentException("Piece already at coordinates");
            }
        }

        pieces.add(piece);
    }

    public boolean validate(int x, int y) {
        if (x < 1 || x > 8 || y < 1 || y > 8) {
            return false;
        }
        return true;
    }

    public void removeAt(int x, int y) {
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).getCoordinatesX() == x && pieces.get(i).getCoordinatesY() == y) {
                pieces.remove(i);
                break;
            }
        }
    }

    public Piece getAt(int x, int y) {
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).getCoordinatesX() == x && pieces.get(i).getCoordinatesY() == y) {
                return pieces.get(i);
            }
        }
        return null;
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}
