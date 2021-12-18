package GettersSetters;

public class Disease {
    private String name;
    private boolean curable;

    Disease(String title, boolean isCurable)
    {
        this.curable = isCurable;
        this.name =title;
    }

    boolean isCurable(){
        return this.curable;
    }

    String getName()
    {
        return this.name;
    }
    //setters
    public void setCurable(boolean curable){
        this.curable =curable;
    }
}
