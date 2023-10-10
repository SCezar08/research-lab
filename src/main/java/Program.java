import ro.scoalainformala.organisms.Owl;
import ro.scoalainformala.organisms.Lion;
import ro.scoalainformala.organisms.Organism;
import ro.scoalainformala.organisms.Goldfish;

public class Program {

    public static void main(String[] args) {

        Organism[] organisms = {
                new Lion("Leo", 5, "Male", 190, "fur"),
                new Owl("Hedwig", 3, "Male", 4.2, "feathers"),
                new Goldfish("Nemo", 2, "Male", 0.2, "scale")
        };

        for (Organism x : organisms) {
            System.out.println("The " + x.getClass().getSimpleName().toLowerCase() + " named " + x.move() + " He is a " + x.getAge() + " years old "
                    + x.getSex().toLowerCase() + " with a weight of " + x.getWeight() + " kilograms " + "with an outer cover of "
                    + x.getOuterCover() + ". " + x.eat() + " The " + x.reproduction());
        }
        System.out.println();

        Lion l = new Lion("King", 4, "Male", 190, "fur");
        Lion n = new Lion("YY", 4, "Male", 190, "fur");
        Owl o = new Owl("Hedwig", 9, "Male", 4.2, "feathers");
        Goldfish g = new Goldfish("Nemo", 3, "Male", 0.2, "scale");

        System.out.println(l.toString() + ". The " + l.getClass().getSimpleName().toLowerCase() + " named " + l.roar());
        System.out.println(o.toString() + ". The " + o.getClass().getSimpleName().toLowerCase() + " named " + o.vision());
        System.out.println(g.toString() + ". The " + g.getClass().getSimpleName().toLowerCase() + " named " + g.memory());
        System.out.println();

        boolean result = l.getAge() == o.getAge(); // false
        System.out.println("Is the lion age the same with the owl's age? " + result);

        boolean result1 = l.equals(n);
        System.out.println("Is the lions age the same ? " + result1);
    }
}
