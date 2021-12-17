package exercises;

public class Cat {
    //member variable
    private String name;
    private int lives=3;

    //mighty constructor
    Cat(String name)
    {
        this.name = name;
    }

    //method : functionality
    void mewow()
    {
        System.out.println("meeeeeeeeeeooooooooooooowwwwww");
    }

    public void printName(){
        if (name== null)
            System.out.println("I don't know my name");
        else
            System.out.println("my name is " + name);

    }

    void kill(){
        lives--;
        if(lives >= 1)
            System.out.println("nice try, but I still have " + lives + " lives left");
        else if (lives<1)
            System.out.println("DEAD CAT :(");
    }

    public static void main(String[] args) {
        Cat cat = new Cat("J");
        cat.mewow();
        cat.printName();
        cat.kill();
        cat.kill();
        cat.kill();
    }
}
