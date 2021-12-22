package Inheritance;

import java.util.Random;

public class Randomness {
    public static void main(String[] args) {
        ExtraRandom random =  new ExtraRandom();
        System.out.println(random.nextInt());
        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());
        System.out.println(random.nextLetter());

    }
}
