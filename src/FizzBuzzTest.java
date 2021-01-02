public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.testFizzBuzz(15,"FizzBuzz");
        fizzBuzzTest.testFizzBuzz(3,"Fizz");
        fizzBuzzTest.testFizzBuzz(5,"Buzzd");


    }

    void testFizzBuzz(int value, String expectedResult){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(value);

        if(result.equals(expectedResult)){
            System.out.println("Test Ok");
        }else{
            System.out.println("Test Failed");
        }
    }
}
