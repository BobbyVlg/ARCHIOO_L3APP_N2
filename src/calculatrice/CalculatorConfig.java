package calculatrice;

import java.util.HashMap;

public class CalculatorConfig {

    private static HashMap<Character, Operation> data;

    public CalculatorConfig() {
        data = new HashMap<Character, Operation>();
    }

    public static Operation getOperation(char sign) {
        return data.get(sign);
    }

    public void init() {
        data.put('+', new Addition());
        data.put('/', new Division());
    }
}
