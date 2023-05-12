package Prototype.Models;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return new Person(this.name,this.age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
