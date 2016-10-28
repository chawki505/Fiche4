/**
 * Created by chawki on 28/10/16.
 */
public class Main {

    public static void main(String[] args) {

        PointA point = new PointA("A", 10, 5);

        System.out.println("Avant:");
        point.afficheCor();//afficher le point

        point.deplace(5, -5);//deplacer le point

        System.out.println("\nApres:");
        point.afficheCor();//afficher le nouveau deplacement


    }
}
