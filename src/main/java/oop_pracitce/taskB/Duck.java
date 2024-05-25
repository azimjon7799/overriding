package oop_pracitce.taskB;

public class Duck extends Animal{
    private String name;
    private String voice;

    public Duck(String name, String voice) {
        this.name = name;
        this.voice = voice;
    }

    public String getName() {
        return name;
    }
    public String sound() {
        return voice;
    }

    public static void main(String[] args) {
        Duck duck = new Duck("Scruch", "Quack quack");
        duck.info();
    }
}
