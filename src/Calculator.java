public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int substract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
    public int power(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int firstNumber){
        return firstNumber%2==0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if(firstNumber > secondNumber){
            return firstNumber;
        }else if(firstNumber < secondNumber){
            return secondNumber;
        }else {
            return firstNumber;
        }
    }
}
