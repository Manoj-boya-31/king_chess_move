import java.util.ArrayList;
import java.util.List;

public class King implements Piece {

    private boolean isWhite;

    public King(boolean isWhite) {
        this.isWhite = isWhite;
    }

    @Override
    public List<Position> posMoves(ChessBoard board, Position pos) {
        List<Position> moves = new ArrayList<>();
        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
                if (x == 0 && y == 0) {
                    continue;
                }
                Position newPos = new Position(pos.x + x, pos.y + y);
                if (board.isValidPosition(newPos)) {
                    moves.add(newPos);
                }
            }
        }
        // Add special moves here, such as castling
        return moves;
    }

    @Override
    public boolean isWhite() {
        return isWhite;
    }

    // Add other methods such as value(), name(), and image()
}