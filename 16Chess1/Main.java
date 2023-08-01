public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Rook rook1 = new Rook(1, 1, "white");
        board.addPiece(rook1);
        Move move1 = new Move(1, 1, 6, 3, rook1);
        System.out.println(move1);

        // for (int i = 1; i <= 8; i++)
        // {
        //     System.out.println((char) ('a' + i - 1));
        // }
    }
}
