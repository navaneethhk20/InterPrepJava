package August.July.Ex04072025.Polymorphism.overriding;

public class Lab01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Bark();
        Hound hound = new Hound();
        hound.Bark();
        Dog d1 = new Hound();
        d1.Bark();
    }
}
