public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color;

    public Piece(int x, int y) {
        this.coordinatesX = x;
        this.coordinatesY = y;
        this.color = "white";
    }

    public Piece(int x, int y, String color) {
        this.coordinatesX = x;
        this.coordinatesY = y;
        this.color = color;
    }

    public abstract String getSymbol();

    public abstract boolean canMove(Board board, int x, int y);

    public int getCoordinatesX() {
        return this.coordinatesX;
    }

    public int getCoordinatesY() {
        return this.coordinatesY;
    }

    public String getColor() {
        return this.color;
    }

    public void setCoordinatesX(int x) {
        this.coordinatesX = x;
    }

    public void setCoordinatesY(int y) {
        this.coordinatesY = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean checkPosition(int x, int y){
        if (x < 1 || x > 8 || y < 1 || y > 8) {
            return false;
        }
        return true;
    }

}
