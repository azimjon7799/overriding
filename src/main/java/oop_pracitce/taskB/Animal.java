package oop_pracitce.taskB;

public class Animal {
    public String sound(){
        return "sound";
    }
    public String getName(){
        return "Animal";
    }

    public void info(){
        System.out.println("My name is " + this.getName());
        System.out.println("My sound is " + this.sound());
    }
}
