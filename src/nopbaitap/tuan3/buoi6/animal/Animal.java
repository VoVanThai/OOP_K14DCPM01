package nopbaitap.tuan3.buoi6.animal;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Animal {
    private String picture;
    private String food;
    private int hunger;

    protected void makeNoise(){

    }

    protected void eat(){
        System.out.println("nhoam nhoam");
    }

    protected void sleep(){
        System.out.println("Zzz");
    }

    protected void roam(){
        System.out.println("lach bach");
    }
}
