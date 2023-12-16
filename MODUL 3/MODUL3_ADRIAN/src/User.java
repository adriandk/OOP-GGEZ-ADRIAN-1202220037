public class User {
    protected String name;
    protected int ID;

    public User(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getUserDetail(){
        return "Name - ID : " + this.name + ", " + this.ID;
    }
}
