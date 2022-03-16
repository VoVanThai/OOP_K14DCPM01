package nopbaitap.tuan3.buoi6.animal;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class Animal {
    private String picture;
    private String food;
    private int hunger;
    private String name;


    public Animal(){
        this.name = "Kitty";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
