/**
 * Created by chawki on 28/10/16.
 */
public class Main {

    public static void main(String[] args) {

        PointNom point1 = new PointNom("A", 10, 5);
        PointNom point2 = new PointNom("B", 2);

        System.out.println("Avant:");
        point1.afficheCor();//afficher le point
        point2.afficheCor();

        point1.deplace(5, -5);//deplacer le point
        point2.deplace(1,2);

        System.out.println("\nApres:");
        point1.afficheCor();//afficher le nouveau deplacement
        point2.afficheCor();


    }
}
