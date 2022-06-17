public class SpiderOrientedFactory implements Factory{
    @Override
    public Animal createAnimal() {
        int a = (int) (Math.random()*10)% 4;

        if (a == 0){
            return new Cat();
        }else{
            return new Spider();
        }
    }
}
