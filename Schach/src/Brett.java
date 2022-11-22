public class Brett {

    private Figur[][] brett = new Figur[8][8];;

    public Brett() {
    }

    public Figur getXY(int pX, int pY) {
        return brett[pX][pY];
    }

    public void setXY(int pX, int pY, Figur pFigur) {
        brett[pX][pY] = pFigur;
    }
}
