package MTPRACTICE;

public class CatTest {
    public static void main(String[] args) {
        Cat c1 = new Cat("Chompers", 10, false);
        Cat c2 = new Cat("Sam", 14, false);
        CatHouse myHouse = new CatHouse(c1, c2);
        myHouse.rollCall();
        System.out.println();

        Cat c3 = new Cat("Spot", 12, false);
        Cat c4 = new Cat("Brad", 12, false);
        myHouse = new CatHouse(c3, c4);
        myHouse.rollCall();
        System.out.println();

        Cat c5 = new Cat("Davis", 14, false);
        Cat c6 = new Cat("Frankie", 12, false);
        myHouse = new CatHouse(c5, c6);
        myHouse.rollCall();
        System.out.println();

    }
}
