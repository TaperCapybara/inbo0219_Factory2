package ru.mirea.inbo0219_Factory2;

public class Test {
    public static void main(String[] args) {
        ChairFactory f1 = new ChairFactory();
        Client a1 = new Client ();


        a1.setChair(f1.createVictorianChair());
        a1.setChair(f1.createFunctionalChair());
        a1.setChair(f1.createMagicChair());
    }
}
