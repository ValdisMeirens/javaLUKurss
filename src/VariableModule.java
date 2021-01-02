import java.util.Scanner;

public class VariableModule {
    public static void main(String[] args) {
        System.out.println("Enter values");
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
//        String operation = scanner.next();

        System.out.println("Area: " + Math.PI * Math.pow(num1,2));
        System.out.println("Perimeter: " + 2* Math.PI * num1);

        System.out.println((num1+num2+num3) /3);

       for(int i = 1; i<=10; i++){
           System.out.print(num1 * i );
       }
//        switch (operation)
//        {
//            case "+" :{
//                System.out.print(num1+num2);
//                break;
//            }
//
//            case "-":{
//                System.out.print(num1-num2);
//                break;
//            }
//            default :
//            {
//                System.out.print("Please select proper operator");
//                return;
//            }
//        }
    }
}
