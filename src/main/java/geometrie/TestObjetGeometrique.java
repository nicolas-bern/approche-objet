package geometrie;

public class TestObjetGeometrique {
    public static void main(String[] args) {

        ObjetGeometrique cercle = new Cercle(2);
        ObjetGeometrique rectangle = new Rectangle(4, 2);

        ObjetGeometrique[] tableau = {cercle, rectangle};

        for (int i = 0; i < tableau.length; i++) {
            if(tableau[i] instanceof Cercle) {
                System.out.println("Cercle--------");
                System.out.println("Périmètre : " + tableau[i].perimetre());
                System.out.println("Surface : " + tableau[i].surface() + "\n");

            } else {
                System.out.println("Rectangle------");
                System.out.println("Périmètre : " + tableau[i].perimetre());
                System.out.println("Surface : " + tableau[i].surface());
            }
        }
    }
}
