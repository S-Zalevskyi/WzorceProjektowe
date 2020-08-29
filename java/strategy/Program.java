package strategy;

public class Program {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.setStrategy(new AddStrategy());
        int result = calculator.calculate(10, 2);
        System.out.println(result);

        calculator.setStrategy(new SubstractStrategy());
        result = calculator.calculate(10, 2);
        System.out.println(result);

        calculator.setStrategy(new MultiplyStrategy());
        result = calculator.calculate(10, 2);
        System.out.println(result);

        calculator.setStrategy(new DivideStrategy());
        result = calculator.calculate(10, 2);
        System.out.println(result);

        calculate("add", 10, 2);
    }

    private static int calculate(String operator, int a, int b) {

        Calculator calculator = new Calculator();

        if (operator.equals("add")) {
            calculator.setStrategy(new AddStrategy());
        } else if (operator.equals("minus")) {
            calculator.setStrategy(new SubstractStrategy());
        }  else if (operator.equals("multiply")) {
            calculator.setStrategy(new MultiplyStrategy());
        } else if (operator.equals("divide")) {
            calculator.setStrategy(new DivideStrategy());
        } else {
            return 0;
        }

        int result = calculator.calculate(10, 2);
        System.out.println(result);

        return result;
    }
}