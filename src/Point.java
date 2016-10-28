/**
 * Created by chawki on 28/10/16.
 */
public class Point {
    private double x, y;


    public Point(double x, double y) {

        this.x = x;
        this.y = y;
    }

    public Point(double x) {
        this.x = x;
        this.y = x;

    }

    public Point() {
        this.x = this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
