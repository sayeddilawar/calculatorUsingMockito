public class Calculator {

    ArithmeticOperation arithmetic;
    public Calculator (ArithmeticOperation arithmetic){
        this.arithmetic = arithmetic;

    }

    public double sum(double input1, double input2) {
        return input1+input2;
    }

    public double Diff(double input1, double input2) {
        return input1-input2;
    }

    public double Product(double input1, double input2) {
        return input1*input2;
    }

    public double Quotient(double input1, double input2) {
        return input1/input2;
    }
}