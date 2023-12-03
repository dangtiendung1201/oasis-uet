public abstract class Piece {
    private static final int MAX_BOARD_SIZE = 8;
    private static final int MIN_BOARD_SIZE = 1;

    private int coordinatesX;
    private int coordinatesY;
    private String color;

    /** Javadoc. */
    public Piece() {
        this.coordinatesX = 0;
        this.coordinatesY = 0;
        this.color = "white";
    }

    /** Javadoc. */
    public Piece(int x, int y) {
        this.coordinatesX = x;
        this.coordinatesY = y;
        this.color = "white";
    }

    /** Javadoc. */
    public Piece(int x, int y, String color) {
        this.coordinatesX = x;
        this.coordinatesY = y;
        this.color = color;
    }

    /** Javadoc. */
    public abstract String getSymbol();

    /** Javadoc. */
    public abstract boolean canMove(Board board, int x, int y);

    /** Javadoc. */
    public int getCoordinatesX() {
        return coordinatesX;
    }

    /** Javadoc. */
    public void setCoordinatesX(int x) {
        this.coordinatesX = x;
    }

    /** Javadoc. */
    public int getCoordinatesY() {
        return coordinatesY;
    }

    /** Javadoc. */
    public void setCoordinatesY(int y) {
        this.coordinatesY = y;
    }

    /** Javadoc. */
    public String getColor() {
        return color;
    }

    /** Javadoc. */
    public void setColor(String color) {
        this.color = color;
    }

    /** Javadoc. */
    public boolean checkPosition(int x, int y) {
        if (x < MIN_BOARD_SIZE || x > MAX_BOARD_SIZE || y < MIN_BOARD_SIZE || y > MAX_BOARD_SIZE) {
            return false;
        }

        return true;
    }
}
