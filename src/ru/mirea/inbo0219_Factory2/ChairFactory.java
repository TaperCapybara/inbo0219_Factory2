package ru.mirea.inbo0219_Factory2;

public class ChairFactory implements AbstractChairFactory{

    public VictorianChair createVictorianChair() {
        VictorianChair c1 = new VictorianChair(50);
        System.out.print(c1.getAge());
        System.out.print("\n");
        return c1;
    }

    public MagicChair createMagicChair() {
        MagicChair c2 = new MagicChair();
        c2.doMagic();
        System.out.print("\n");
        return c2;
    }

    public FunctionalChair createFunctionalChair() {
        FunctionalChair c3 = new FunctionalChair();
        System.out.print("4 + 5 = ");
        System.out.print(c3.sum(4, 5));
        System.out.print("\n");
        return c3;
    }
}
