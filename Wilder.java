public class Wilder {
    private String firstname;
    private boolean isAware;

    public Wilder(String name) {
        this.firstname = name;
    }
    public Wilder(String name, boolean aware) {
        this.firstname = name;
        this.isAware = aware;
    }

    // Getters
    public String getFirstname() { return this.firstname ; }
    public boolean isAware(){ return this.isAware; }

    // Setters
    public void setFirstname(String firstname){ this.firstname = firstname; }
    public void setAware(boolean aware){ this.isAware = aware ; }

    public String whoAmI() {
        if (this.isAware()) {
            return "My name is "+this.getFirstname()+" and I am aware";
        } else {
            return "My name is "+this.getFirstname()+" and I am not aware";
        }
    }
}
