public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Bishop bishop1 = new Bishop(1, 1, "white");
        Bishop bishop2 = new Bishop(1, 1, "white");
        board.addPiece(bishop1);
        board.addPiece(bishop2);
    }
}
