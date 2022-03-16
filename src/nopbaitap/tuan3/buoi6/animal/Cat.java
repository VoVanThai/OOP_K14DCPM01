package nopbaitap.tuan3.buoi6.animal;

public class Cat extends Animal{

    double giveCute;

    public Cat(){
        super();
        this.giveCute = 500;
    }

    public String toString(){
        return "Cat cute " +giveCute+ " Name " +this.getName(); 
    }

    public Cat(double giveCute, String name){
        
        this.giveCute = giveCute;
    }

    @Override
    protected void makeNoise(){
        System.out.println("Meow meow");
    }

    protected void catchMouse(){
        System.out.println("Caught mouse");
    }
}
