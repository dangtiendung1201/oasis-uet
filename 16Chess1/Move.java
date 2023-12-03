public class Move {
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    private Piece movedPiece;
    private Piece killedPiece;

    /** Javadoc. */
    public Move() {
        startX = 0;
        startY = 0;
        endX = 0;
        endY = 0;
        movedPiece = null;
        killedPiece = null;
    }

    /** Javadoc. */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;

        this.movedPiece = movedPiece;
    }

    /** Javadoc. */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece, Piece killedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;

        this.movedPiece = movedPiece;
        this.killedPiece = killedPiece;
    }

    /** Javadoc. */
    public String toString() {
        return movedPiece.getColor()
                + "-" + movedPiece.getSymbol()
                + (char) ('a' + endX - 1) + endY;
    }

    /** Javadoc. */
    public int getStartX() {
        return startX;
    }

    /** Javadoc. */
    public void setStartX(int x) {
        this.startX = x;
    }

    /** Javadoc. */
    public int getEndX() {
        return endX;
    }

    /** Javadoc. */
    public void setEndX(int x) {
        this.endX = x;
    }

    /** Javadoc. */
    public int getStartY() {
        return startY;
    }

    /** Javadoc. */
    public void setStartY(int y) {
        this.startY = y;
    }

    /** Javadoc. */
    public int getEndY() {
        return this.endY;
    }

    /** Javadoc. */
    public void setEndY(int y) {
        this.endY = y;
    }

    /** Javadoc. */
    public Piece getMovedPiece() {
        return movedPiece;
    }

    /** Javadoc. */
    public void setMovedPiece(Piece piece) {
        this.movedPiece = piece;
    }

    /** Javadoc. */
    public Piece getKilledPiece() {
        return killedPiece;
    }

    /** Javadoc. */
    public void setKilledPiece(Piece piece) {
        killedPiece = piece;
    }
}
