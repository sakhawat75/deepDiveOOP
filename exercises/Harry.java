package exercises;

public class Harry {

    private boolean cloakOn;
    private String Spell;

    Harry()
    {
        System.out.println("Making Harry Potter");
    }

    void castSpell(String spell)
    {
        this.Spell = spell;
        System.out.println("casting spell: "+ spell);
    }

    void makeInvisible(boolean invisible){
        this.cloakOn = invisible;
        if(cloakOn)
        {
            System.out.println("Harry is invisible");
        }
        else
            System.out.println("Harry is visible");
    }

    void spyOnSnape(){
        System.out.println("Garry sees Professor Snape doing nefarious things");
    }

    public static void main(String[] args) {
        Harry harry= new Harry();
        harry.makeInvisible(true);
        harry.spyOnSnape();
        harry.makeInvisible(false);
        harry.castSpell("stupefy");

    }
}
