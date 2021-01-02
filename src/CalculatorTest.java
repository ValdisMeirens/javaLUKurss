public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.calculatorTest(10,10,23);
        calculatorTest.maxNumberTest(10,2,13);
    }
    public void calculatorTest(int num1, int num2, int expectedResult){

        Calculator calculator = new Calculator();
        int sumTest1 = calculator.sum(num1, num2);

        if(sumTest1 == expectedResult){
            System.out.println("Test Ok");
        }else {
            System.out.println("Test Failed");
        }
    }

    public void maxNumberTest(int num1, int num2, int expectedResult){
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(num1 , num2);
        if(result == expectedResult){
            System.out.println("Test Ok");
        }else {
            System.out.println("Test Failed");
        }
    }
}
