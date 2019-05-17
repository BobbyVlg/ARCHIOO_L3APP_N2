public class Calcul {

    public void calculer(double a, double b, Character character) {
        // TODO ici instancie objet calcultricconf pour apeller lafonction getoperation,
        CalculatorConfig cf = new CalculatorConfig();

        Operation operation = cf.getOperation(character);

        double res = operation.executer(a,b);
    }

}