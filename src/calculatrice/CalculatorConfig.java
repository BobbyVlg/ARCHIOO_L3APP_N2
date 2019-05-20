package calculatrice;

import java.util.HashMap;

public class CalculatorConfig {

    private HashMap<Character, Operation> data;

    public CalculatorConfig() {
        this.data = new HashMap<Character, Operation>();
    }

    public Operation getOperation(Character sign) {
        return this.data.get(sign);
    }

    public void init() {
        this.data.put('+', new Addition());
        this.data.put('/', new Division());
    }

    // il faut init la calcultarice dans l'application
}
