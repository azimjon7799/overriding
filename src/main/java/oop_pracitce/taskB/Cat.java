package oop_pracitce.taskB;

public class Cat extends Animal{

    private String name;
    private String voice;

    public Cat(String name, String voice) {
        this.name = name;
        this.voice = voice;
    }

    public String getName() {
        return name;
    }
    public String sound(){
        return voice;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Kis-kis", "meow meow");
        cat.info();
    }
}
