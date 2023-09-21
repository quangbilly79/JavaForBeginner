package javacourse.section20OOPpart2;

abstract class Animal1 {
    abstract void bark();
}
class Dog1 extends Animal1 {
    @Override
    void bark() {
        System.out.println("Bow Bow");
    }
}class Cat1 extends Animal1 {
    @Override
    void bark() {
        System.out.println("Meow Meow");
    }
}

public class AbstractClassExercise {

    public static void main(String[] args) {
        Animal1[] animals = {new Cat1(), new Dog1()};
        for (Animal1 elem:animals) {
            elem.bark();
        }
    }

}
