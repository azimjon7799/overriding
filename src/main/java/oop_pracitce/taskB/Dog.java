package oop_pracitce.taskB;

public class Dog extends Animal{
    private String voice;
    private String name;

    public Dog(String name, String voice) {
        this.name = name;
        this.voice = voice;
    }

    public String sound(){
        return voice;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Rex", "Bow bow");
        dog.info();
    }
}
