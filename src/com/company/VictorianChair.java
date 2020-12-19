package com.company;

public class VictorianChair implements Chair{
    private int age;

    public int getAge() {
        return age;
    }

    public VictorianChair(int age)
    {
        this.age=age;
    }

    @Override
    public String toString() {
        return "victorian chair and I am too old ("+age+" years old) for this";
    }
}
