public class Cat implements Animal{

    @Override
    public String makeSound() {
        return "Meow";
    }

    @Override
    public int legCount() {
        return 4;
    }
}
