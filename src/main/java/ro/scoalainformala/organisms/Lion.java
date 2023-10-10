package ro.scoalainformala.organisms;

/**
 * Lion
 * ----
 * - characteristics (properties)
 * - (name, age, sex, weight, outerCover)
 * - behaviors (actions; methods)
 * - move
 * - eat
 * - reproduct
 * - roar
 */

public class Lion extends Organism {

    public Lion(String name, int age, String sex, double weight, String outerCover) {

        super(name, age, sex, weight, outerCover);
    }

    @Override
    public String move() {

        return super.getName() + " is running!";
    }

    @Override
    public String eat() {
        return super.getName() + " is eating meat.";
    }

    @Override
    public String reproduction() {
        return super.getClass().getSimpleName().toLowerCase() + " gives birth.";
    }

    public String roar() {

        return super.getName() + " is roaring!";
    }
}
