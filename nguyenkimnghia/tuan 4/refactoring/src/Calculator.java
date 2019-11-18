
    public class Calculator {

        public static final char ADDITION = '+';
        public static final char SUBTRACTION = '-';
        public static final char MULTIPLICATION = '*';
        public static final char DIVISION = '/';

        public static int Calculate(int firstOperand, int secondOperand, char operand) {
            switch (operand) {
                case '+':
                    return firstOperand + secondOperand;
                case '-':
                    return firstOperand - secondOperand;
                case '*':
                    return firstOperand * secondOperand;
                case '/':
                    if (secondOperand != 0)
                        return firstOperand / secondOperand;
                    else
                        throw new RuntimeException("Can not divide by 0");
                default:
                    throw new RuntimeException("Unsupported operation");
            }
        }
    }
