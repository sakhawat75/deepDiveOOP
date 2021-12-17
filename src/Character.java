public class Character {

    private String name;
    private String species;

    public Character(String name, String species)
    {
        this.name = name;
        this.species = species;
    }

    public static void main(String[] args) {
        Character bilbo = new Character("Bilbo","Hobbit");
        Character legolas = new Character("Legolas","Elf");
    }

}
