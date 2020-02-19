package Dz;

public class Robot {
    private String name;
    private int age;
    private int metal;

    public void work() {
        System.out.println("Я робот - я просто працюю");
    }

    public Robot(String name, int age, int metal) {
        this.name = name;
        this.age = age;
        this.metal = metal;
    }

    public Robot() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMetal() {
        return metal;
    }

    public void setMetal(int metal) {
        this.metal = metal;
    }
}
