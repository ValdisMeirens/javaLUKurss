public class Robot {
    String name;
    Robot(String robotName){
        this.name = robotName;
    }
    public void sayHello() {
        System.out.println("Hello");
    }
    public void sayYourName(){
        System.out.println("My name is " +this.name);
    }

    public void setName(String name){
        this.name = name;
    }
}
