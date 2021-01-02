public class LightColorDetectorDemo {

    public static void main(String[] args) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String color = lightColorDetector.detect(500);
        System.out.println(color);
    }
}
