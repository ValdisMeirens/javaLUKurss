import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        Calculator calculator1 =  new Calculator();
        int result = calculator1.sum(num1,num2);
        System.out.println(result);

        calculator1.isEven(num1);
        System.out.println(calculator1.isEven(num1));

    }
}
