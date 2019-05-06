public class LigneCommande implements IHM {

    private char operateur;
    private double a;
    private double b;

    @Override
    public void lancer() {
    }

    public char getOperateur() {
        return this.operateur;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
