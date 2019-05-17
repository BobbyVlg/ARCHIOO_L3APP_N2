public class Division implements Operation {

    public double executer(double a , double b){
        if(b == 0){
            throw new ArithmeticException("You can't divide by zero");
        }
        return a/b;
    }
}
