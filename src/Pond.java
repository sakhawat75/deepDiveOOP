public class Pond {
    // the mighty constructor
    public static void main(String[] args) {
        String me = "Sakhawat"; //variable
        Duck mobyDuck = new Duck("Moby",90/3,"celery"); //constructor
        Duck wolfGangDuck = new Duck("Wolf Gang",60/3,"cheesburgers");
        mobyDuck.quack();
        mobyDuck.waddle();
        System.out.println(mobyDuck);
    }
}
