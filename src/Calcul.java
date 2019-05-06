public class Calcul {

    private LigneCommande lc;
    
    public boolean isAddition(LigneCommande lc){
        return (lc.getOperateur() == '+');
    }

    public boolean isDivision(LigneCommande lc){
        return (lc.getOperateur() == '/');
    }
}
