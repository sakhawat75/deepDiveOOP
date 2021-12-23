package Polymorphism;

import java.util.List;
import java.util.zip.CheckedOutputStream;

public class UnitedNations {
    public static void main(String[] args) {
        new Country().dance();
        new UK().dance();
        new Bangladesh().dance();

        Country country=new Country();
        UK uk= new UK();
        Bangladesh bangladesh = new Bangladesh();

        List<Country> countries = List.of(uk, bangladesh);
        for (Country country2 : countries)
        {
            country2.dance();
        }
    }
}
