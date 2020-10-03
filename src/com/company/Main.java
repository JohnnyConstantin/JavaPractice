package com.company;

abstract class Robot {
    protected String model = "Robot";
    protected int capacity = 100;

    public Robot(){}

    public Robot(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getModel() {
        return model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static void main(String args[]) {
        Vacuumcleaner R2D2 = new Vacuumcleaner(50);
        Killer Ux32 = new Killer();

        System.out.println(Ux32.getCapacity() + " " +
                Ux32.getModel() + " " +
                Ux32.getBullets());
        Ux32.working();

        System.out.println(R2D2.getCapacity()+" "+
        R2D2.getModel()+ " " + R2D2.getPower());
        R2D2.working();
        System.out.println();


    }
}

class Vacuumcleaner extends Robot{
    private int power;
    private final String model = "vacuumcleaner";
    public Vacuumcleaner(){}

    public Vacuumcleaner(int power){
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPower() {
        return power;
    }

    public int getCapacity() {
        return super.getCapacity();
    }

    public void setPower(int power) {
        this.power = power;
    }


    public void setModel(String model) {
        super.setModel(model);
    }

    void working(){
        System.out.println("Cleaning rooms");
    }
}

class Killer extends Robot{
    private int bullets = 10;
    private final String model = "Killer";

    public Killer(){}

    public Killer(int bullets){
        this.bullets = bullets;
    }

    void working(){
        System.out.println("Killing people");
    }

    public void setModel(String model) {
        super.setModel(model);
    }

    public int getCapacity() {
        return super.getCapacity();
    }

    public String getModel() {
        return this.model;
    }

    public void setCapacity(int capacity) {
        super.setCapacity(capacity);
    }

    public void setBullets(int bullets) {
        this.bullets = bullets;
    }

    public int getBullets() {
        return bullets;
    }
}
