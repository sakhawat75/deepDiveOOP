public class Duck {
    //member variables: data (encapsulated/private)
    public String name;
    private int lifeExpectancy;
    private String favoriteFood;

    // the mighty constructor :auto generate
    public Duck(String name, int lifeExpectancy, String favoriteFood) {
        this.name = name;
        this.lifeExpectancy = lifeExpectancy;
        this.favoriteFood = favoriteFood;
    }

    //method: functionality
    void waddle(){
        lifeExpectancy++;
        System.out.println("waddle waddle");
    }
    void quack(){
        System.out.println(this.name + " is quacking");
    }

    //override and toString
    @Override
    public java.lang.String toString() {
        return "My name is " + name + " I like to eat "+ favoriteFood + " lifeExpectecny is " + lifeExpectancy;
    }
}
