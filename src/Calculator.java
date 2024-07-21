public class Calculator {
        public void CalculatorInteger(String operation,int number1,int number2) {
            int answer = 0;

            switch (operation) {
                case "+":
                    answer= number1 + number2;
                    break;
                case "-":
                    answer  = number1- number2;
                    break;
                case "*":
                    answer = number1 *number2;
                    break;
                case "/":
                    if (number2 == 0) {
                        System.out.println("Error: Division by zero");
                        return;
                    } else {
                        answer = number1/number2;
                    }
                    break;
                default:
                    System.out.println("Error:");
                    return;
            }

            System.out.println("Answer " + number1 + " " + operation + " " + number2 + " = " + answer );
        }

        public static void main(String[] args) {
            Calculator calculator = new Calculator();
            calculator.CalculatorInteger("+", 1, 2);
            calculator.CalculatorInteger("-", 1, 2);
            calculator.CalculatorInteger("*", 1, 2);
            calculator.CalculatorInteger("/", 4, 2);
            calculator.CalculatorInteger("/", 1, 0);
            calculator.CalculatorInteger("?", 1, 2);
        }
    }
