public class Spider implements Animal{
    @Override
    public String makeSound() {
        return "*silence*";
    }

    @Override
    public int legCount() {
        return 8;
    }
}
