package ro.scoalainformala.organisms;

/**
 * Owl
 * ----
 * - characteristics (properties)
 * - (name, age, sex, weight, outerCover)
 * - behaviors (actions; methods)
 * - move
 * - eat
 * - reproduct
 * - vision
 */

public class Owl extends Organism {

    public Owl(String name, int age, String sex, double weight, String outerCover) {

        super(name, age, sex, weight, outerCover);
    }

    @Override
    public String move() {

        return super.getName() + " is flying!";
    }

    @Override
    public String eat() {
        return super.getName() + " is eating rats.";
    }

    @Override
    public String reproduction() {
        return super.getClass().getSimpleName().toLowerCase() + " hatches eggs.";
    }

    public String vision() {
        return super.getName() + " has night vision.";
    }
}
