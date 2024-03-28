public class Libmath <T extends Number, A extends Number> {
    T number1;
    A number2;

    public Libmath(T number1, A number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double add() {
        return number1.doubleValue() + number2.doubleValue();
    }

    public double min() {
        return number1.doubleValue() - number2.doubleValue();
    }

    
}
