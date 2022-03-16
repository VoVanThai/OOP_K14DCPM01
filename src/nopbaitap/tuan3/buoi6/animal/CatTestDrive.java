package nopbaitap.tuan3.buoi6.animal;

public class CatTestDrive {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat2 = new Cat(1000, "Luna");

        cat.makeNoise();
        cat.catchMouse();
        System.out.println(cat);
        System.out.println(cat2);
    }
}
