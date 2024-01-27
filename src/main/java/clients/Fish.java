package clients;

public class Fish extends Animal {
    @Override
    public void toGo() {
        System.out.println("!!!!I Can't go");
    }

    @Override
    public void fly() {
        System.out.println("!!!I can't fly");
    }
}
