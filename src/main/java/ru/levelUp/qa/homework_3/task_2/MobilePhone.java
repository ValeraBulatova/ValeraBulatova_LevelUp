package ru.levelUp.qa.homework_3.task_2;

public class MobilePhone {


    public MobilePhone(String name, double cost){
        this.name = name;
        this.cost = cost;
    }

    private double cost;
    private String name;

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public void setCost() {
        this.cost = cost;
    }

    public void setName() {
        this.name = name;

    }

    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + cost +
                '}';
    }
}
