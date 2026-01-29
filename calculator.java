import java.util.Scanner;

class Calculator {
    public static double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continuecalc = true;

        while (continuecalc) {
            try {
                System.out.println("first Number:");
                double x = Double.parseDouble(sc.nextLine());

                System.out.println("the operator:");
                String op = sc.nextLine();

                System.out.println("second Number:");
                double x1 = Double.parseDouble(sc.nextLine());

                if (!op.equals("+") && !op.equals("-")&& !op.equals("*") && !op.equals("/")) {
                    throw new IllegalArgumentException("Invalid operator");
                }

                double res = 0;

                switch (op) {
                    case "+" :  res = x + x1;
                    case "-" : res = x - x1;
                    case "*" : res = x * x1;
                    case "/" : res = Calculator.div(x, x1);
                }

                System.out.println("Result = " + res);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("want to continue y/n:");
            String choice = sc.nextLine();
            if (!choice.equalsIgnoreCase("y")) {
                continuecalc = false;
            }
        }

        sc.close();
    }
}
