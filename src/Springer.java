public class Springer extends Figur {
    private int x;
    private int y;

    public Springer(boolean pFarbe, int pX, int pY) {
        super(pFarbe);
        this.x = pX;
        this.y = pY;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
