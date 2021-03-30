public abstract class Piece {

    public boolean taken = false;
    public boolean white = false;

    public Piece(boolean white) {

        this.setWhite(white);

    }

    public void setWhite(boolean white) {

        this.white = white;

    }

    public boolean isWhite() {

        return this.white;

    }

    public boolean isTaken() {

        return this.taken;

    }

    public void setTaken(boolean taken) {

        this.taken = taken;

    }

    public abstract boolean canMove(Board board, Spot start, Spot end);


}