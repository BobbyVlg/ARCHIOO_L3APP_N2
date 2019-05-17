import java.util.Scanner;

public class LigneCommande implements IHM {

    private Character operateur;
    private double a;
    private double b;
    private Scanner sc = new Scanner(System.in);

    @Override
    public void lancer() {
        System.out.print("entrez la première valeur: ");
        a = sc.nextDouble();
        System.out.print("entrez la deuxieme valeur: ");
        b = sc.nextDouble();
        // TODO change charAt
        System.out.print("choissiez un operateur: 1 pour adiitionner | 2 pour diviser");
        int choix;
        choix = sc.nextInt();
        if(choix == 1){
            operateur = '+';
        }
        if(choix ==2){
            operateur = '/';
        }
    }

    public Character getOperateur() {
        return this.operateur;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }
}
