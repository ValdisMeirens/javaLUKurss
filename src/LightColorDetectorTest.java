public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.check(1100, "Invisib1le Light");
    }
    public void check(int wavelenght, String expectedesult){
        LightColorDetector lightColorDetector = new LightColorDetector();
        String color = lightColorDetector.detect(wavelenght);

        if(color.equals(expectedesult)){
            System.out.println("Tests ok");
        }else{
            System.out.println("Test failed");
        }

    }
}
