public class Main {

    public static void main(String[] args) {

        LigneCommande ligneCommande = new LigneCommande();
        CalculatorConfig calculatorConfig = new CalculatorConfig();

        ligneCommande.lancer();
        calculatorConfig.init();

    }
}
