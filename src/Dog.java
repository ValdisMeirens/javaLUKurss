public class Dog {
    private String nickName;
    private int age;
    private String color;

    public Dog(String nickName, int dogAge, String dogColor) {
        this.nickName = nickName;
        this.age = dogAge;
        this.color = dogColor;
    }

    public void setAge(int dogAge){
        this.age = dogAge;
    }

    public void voice() {
        System.out.println(this.nickName + " " + this.age+ " " + this.color);

    }
    void happyBirthDay(){
        this.age = this.age +1;
    }
    void changeColor(String dogColor){
        this.color = dogColor;
    }
}
