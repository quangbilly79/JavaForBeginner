package javacourse.section20OOPpart2;

interface Flyable {
    void fly();
}
class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("with wings");
    }
}
class Aeroplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("with oil");
    }
}

public class InterfaceExercise {
    public static void main(String[] args) {
        Flyable[] flyables = {new Bird(), new Aeroplane()};
        for (Flyable fly:flyables) {
            fly.fly();
        }
    }

}
