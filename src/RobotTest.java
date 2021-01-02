public class RobotTest {
    public static void main(String[] args) {
        Robot robot1 = new Robot("valdis");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("test");
        robot2.sayHello();
        robot2.sayYourName();

        robot1.setName("Valdis");
    }
}
