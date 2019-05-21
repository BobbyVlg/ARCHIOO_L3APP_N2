package calculatrice;

import Properties.MyProperties;
import org.json.simple.parser.ParseException;

import java.util.Scanner;

public class LigneCommande implements IHM {

    private Character operateur;
    private double a;
    private double b;
    private Scanner sc = new Scanner(System.in);
    private MyProperties mp;

    @Override
    public void lancer() throws ParseException {

        mp = new MyProperties();
        System.out.print(mp.readProperties("FIRST_DIGIT"));
        a = sc.nextDouble();
        System.out.print(mp.readProperties("SECOND_DIGIT"));
        b = sc.nextDouble();
        System.out.print(mp.readProperties("THIRD_DIGIT"));
        int choix;
        choix = sc.nextInt();
        try {
            exceptionOperateur(choix);
            if (choix == 1) {
                operateur = '+';
            }
            if (choix == 2) {
                operateur = '/';
            }
            Calcul calcul = new Calcul();
            System.out.println(calcul.calculer(a,b,operateur));
        } catch (CalculatriceException e) {
            System.out.println(ListException.WRONG_SIGN.getMessage());
        }

    }
    private void exceptionOperateur(int choix) throws CalculatriceException {
        if (choix != 1 && choix != 2) {
            throw new CalculatriceException(ListException.WRONG_SIGN.getCode(), ListException.WRONG_SIGN.getMessage());
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
