package hu.nive.ujratervezes.zarovizsga.kennel;

public class Beagle extends Dog {

    public Beagle(String name) {
        super(name);
    }

    public void feed() {
        this.happiness = happiness + 2;
    }

    public void play(int i) {
        this.happiness = happiness + i * 2;
    }






}




