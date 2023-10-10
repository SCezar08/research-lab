package ro.scoalainformala.organisms;

/**
 * Goldfish
 * ----
 * - characteristics (properties)
 * - (name, age, sex, weight, outerCover)
 * - behaviors (actions; methods)
 * - move
 * - eat
 * - reproduct
 * - memory
 */

public class Goldfish extends Organism {

    public Goldfish(String name, int age, String sex, double weight, String outerCover) {

        super(name, age, sex, weight, outerCover);
    }

    @Override
    public String move() {

        return super.getName() + " is swimming!";
    }

    @Override
    public String eat() {
        return super.getName() + " is eating plankton.";
    }

    @Override
    public String reproduction() {
        return super.getClass().getSimpleName().toLowerCase() + " lays eggs.";
    }

    public String memory() {
        return super.getName() + " has short term memory.";
    }
}
