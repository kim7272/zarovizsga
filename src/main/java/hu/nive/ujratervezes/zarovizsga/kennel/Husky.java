 package hu.nive.ujratervezes.zarovizsga.kennel;

public class Husky extends Dog {

    public Husky(String name) {
        super(name);
    }

    public void feed() {
        this.happiness = happiness + 4;
    }

    public void play(int i) {
        this.happiness = happiness + 3 * i;
    }
}

