package calculatrice;

import org.json.simple.parser.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {

        LigneCommande ligneCommande = new LigneCommande();
        CalculatorConfig calculatorConfig = new CalculatorConfig();

        calculatorConfig.init();
        ligneCommande.lancer();


    }
}
