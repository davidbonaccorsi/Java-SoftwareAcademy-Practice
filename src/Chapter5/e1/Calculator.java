package Chapter5.e1;

public class Calculator {

    public static void main(String[] args){
        Calculator calc = new Calculator();
        calc.calculate(5, 10);
        calc.calculate(5.5, 10.5);
        calc.calculate(1, 2, 3);
        calc.calculate("*", 4, 5);
        byte b = 5;
        calc.calculate(b, 10);
        Integer i = 15;
        calc.calculate(i, 20);
    }

    public double calculate(int a, int b){
        return (a+b);
    }

    public double calculate(double a, double b){
        return (a+b);
    }

    public double calculate(double a, double b, double c){
        return (a+b+c);
    }

    public double calculate(String operation, int a, int b){
        double result;
        switch(operation){
            case "+" -> result = a+b;
            case "-" -> result = a-b;
            case "*" -> result = a*b;
            case "/" -> {
                if (b==0) {
                    System.out.println("Cannot devide " + a + " by 0.");
                    return 0;
                }
                result = (double)a / b;
            }
            default -> {
                System.out.println("Operation unidentified");
                return 0;
            }
        }

        return result;
    }
}
