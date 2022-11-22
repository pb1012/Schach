import java.util.ArrayList;

public class Bauer extends Figur{
    private int x;
    private int y;

    public Bauer(boolean pFarbe, int pX, int pY) {
        super(pFarbe);
        this.x = pX;
        this.y = pY;
    }

    public ArrayList<int[]> getMoeglicheFelder() {
        ArrayList<int[]> moeglicheFelder = new ArrayList<>();
        if (getFarbe()) {
            int[] temp;
            if (x == 5) {
                temp = new int[]{x - 2, y};
                moeglicheFelder.add(temp);
                temp[0] = x - 1;
            } else {
                temp = new int[]{x - 1, y};
            }
            moeglicheFelder.add(temp);
        } else {
            int[] temp;
            if (x == 1) {
                temp = new int[]{x + 2, y};
                moeglicheFelder.add(temp);
                temp[0] = x + 1;
            } else {
                temp = new int[]{x + 1, y};
            }
            moeglicheFelder.add(temp);
        }
        return moeglicheFelder;
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
