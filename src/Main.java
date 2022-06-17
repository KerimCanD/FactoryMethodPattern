import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> randomList = new ArrayList<Animal>();
        ArrayList<Animal> spiderOrientedList = new ArrayList<Animal>();
        int i;
        RandomFactory randomFactory = new RandomFactory();
        SpiderOrientedFactory spiderOrientedFactory = new SpiderOrientedFactory();


        for (i = 0 ; i < 10 ; i ++){
            randomList.add(randomFactory.createAnimal());
        }

        for (i = 0 ; i < 10 ; i ++){
            spiderOrientedList.add(spiderOrientedFactory.createAnimal());
        }


        for (Animal a :
                randomList) {
            System.out.println(a.makeSound()+ " - I have " + a.legCount() + " legs");
        }

        System.out.println("--------------------------------------------------");

        for (Animal a :
                spiderOrientedList) {
            System.out.println(a.makeSound()+ " - I have " + a.legCount() + " legs");
        }
    }
}