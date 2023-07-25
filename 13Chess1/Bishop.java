public class Bishop extends Piece {
    public Bishop(int x, int y) {
        super(x, y);
    }

    public Bishop(int x, int y, String color) {
        super(x, y, color);
    }

    public String getSymbol() {
        return "B";
    }

    public boolean canMove(Board board, int x, int y) {
        if (!super.checkPosition(x, y)) {
            return false;
        }

        if (Math.abs(x - super.getCoordinatesX()) != Math.abs(y - super.getCoordinatesY())) {
            return false;
        }

        int xDirection = (x - super.getCoordinatesX()) / Math.abs(x - super.getCoordinatesX());
        int yDirection = (y - super.getCoordinatesY()) / Math.abs(y - super.getCoordinatesY());

        int tempX = super.getCoordinatesX() + xDirection;
        int tempY = super.getCoordinatesY() + yDirection;

        while (tempX != x && tempY != y) {
            if (board.getAt(tempX, tempY) != null) {
                return false;
            }
            tempX += xDirection;
            tempY += yDirection;
        }

        if (board.getAt(x, y) != null) {
            if (board.getAt(x, y).getColor().equals(super.getColor())) {
                return false;
            }
        }

        return true;
    }
}
