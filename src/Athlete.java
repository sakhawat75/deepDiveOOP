public class Athlete {

    private String name;
    private int speed;
    private static String marathonLocation;
    private int bibNumber;
    private static int runnersInRace;

    public Athlete(String Name, int Speed){
        this.name = Name;
        this.speed = Speed;
        runnersInRace++;
        this.bibNumber = runnersInRace;
    }

    public static int getRunnersInRace() {
        return runnersInRace;
    }

    public void setMarathonLocation(String marathonLocation) {
        this.marathonLocation = marathonLocation;
    }

    @Override
    public String toString()
    {
        return "Athlete " + name + "is running at " + speed + " miles per hour at " + marathonLocation + " " + bibNumber;
    }
}
