/**
 * Created by chawki on 28/10/16.
 */
public class Point {
    private double x, y;
    private String nom;

    public Point(String nom, double x, double y) {
        this.nom = nom;
        this.x = x;
        this.y = y;
    }

    public Point(String nom, double x) {
        this.x = x;
        this.y = x;
        this.nom = nom;
    }

    public Point() {
        this.x = this.y = 0;
        this.nom = "O";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getNom() {
        return nom;
    }

    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
