package ro.scoalainformala.organisms;

import java.util.Objects;

public abstract class Organism {

    private String name;
    private int age;

    private String sex;
    private double weight;

    private String outerCover;

    public Organism(String name, int age, String sex, double weight, String outerCover) {

        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.outerCover = outerCover;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOuterCover() {
        return outerCover;
    }

    public void setOuterCover(String outerCover) {
        this.outerCover = outerCover;
    }

    public abstract String move();

    public abstract String eat();

    public abstract String reproduction();

    @Override
    public String toString() {

        return "Name of the organism: " + getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Organism o) {
            return this.getAge() == o.getAge();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex, weight, outerCover);
    }
}
