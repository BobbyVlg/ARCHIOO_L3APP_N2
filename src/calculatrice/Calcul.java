package calculatrice;

public class Calcul {

    public double calculer(double a, double b, char character) {
        Operation operation = CalculatorConfig.getOperation(character);

        return operation.executer(a,b);
    }

}