public class CalculatorTest{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.Calculate(3,4,calculator.ADDITION));
        System.out.println(calculator.Calculate(10,4,calculator.SUBTRACTION));
        System.out.println(calculator.Calculate(3,4,calculator.MULTIPLICATION));
        System.out.println(calculator.Calculate(8,4,calculator.DIVISION));
    }

}
