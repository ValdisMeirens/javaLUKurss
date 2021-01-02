import java.util.Scanner;

public class ConditionModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value");

        int num1 = scanner.nextInt();
        System.out.println("Value entered: " + num1);
        int num2 = scanner.nextInt();
        System.out.println("Value entered: " + num2);
        int num3 = scanner.nextInt();
        System.out.println("Value entered: " + num3);

        if(num1 == num2 && num2 == num3){
            System.out.println("All numbers are equal");
        }else if(num1 != num2 && num1 != num3 && num2 != num3){
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");
        }

        if(num1 < num2 && num2 < num3){
            System.out.println("Inscresing");
        }else if(num1 > num2 && num2 > num3 ){
            System.out.println("Descrising");
        }else {
            System.out.println("Neither increasing or decreasing order");
        }


        if(num1 > num2 && num1 > num3){
            System.out.println("1");
        }else if(num2 > num1 && num2 > num3 ){
            System.out.println("2");
        }else if(num3 > num1 && num3 > num2 ){
            System.out.println("3");
        }
    }
}
