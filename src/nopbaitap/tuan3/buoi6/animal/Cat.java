package nopbaitap.tuan3.buoi6.animal;

public class Cat extends Animal{

    @Override
    protected void makeNoise(){
        System.out.println("Meow meow");
    }

    protected void catchMouse(){
        System.out.println("Caught mouse");
    }
}
