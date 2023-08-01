public class Move {
    private int startX;
    private int startY;

    private int endX;
    private int endY;

    private Piece movedPiece;
    private Piece killedPiece;

    public Move(int startX, int startY, int endX, int endY, Piece movedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;

        this.movedPiece = movedPiece;
    }

    public Move(int startX, int startY, int endX, int endY, Piece movedPiece, Piece killedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;

        this.movedPiece = movedPiece;
        this.killedPiece = killedPiece;
    }

    public String toString() {
        String result = movedPiece.getColor() + "-" + movedPiece.getSymbol();
        result += (char) ('a' + endX - 1);
        result += endY;
        return result;
    }

    public int getStartX() {
        return this.startX;
    }

    public int getStartY() {
        return this.startY;
    }

    public int getEndX() {
        return this.endX;
    }

    public int getEndY() {
        return this.endY;
    }

    public Piece getMovedPiece() {
        return this.movedPiece;
    }

    public Piece getKilledPiece() {
        return this.killedPiece;
    }

    public void setStartX(int x) {
        this.startX = x;
    }

    public void setStartY(int y) {
        this.startY = y;
    }

    public void setEndX(int x) {
        this.endX = x;
    }

    public void setEndY(int y) {
        this.endY = y;
    }

    public void setMovedPiece(Piece piece) {
        this.movedPiece = piece;
    }

    public void setKilledPiece(Piece piece) {
        this.killedPiece = piece;
    }
}
