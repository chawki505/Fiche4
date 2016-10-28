import java.util.Objects;

/**
 * Created by chawki on 28/10/16.
 */
public class PointA extends Point {

    public PointA(String nom, int x, int y) {
        super(nom, x, y);
    }

    public PointA(String nom, int x) {
        super(nom, x);
    }


    public void afficheCor() {
        System.out.println(getNom() + "( " + getX() + " , " + getY() + " )");
    }
}
