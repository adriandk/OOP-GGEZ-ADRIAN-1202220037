public class Admin extends User {

    public Admin(String name, int ID) {
        super(name, ID);
    }

    public void manageSystem(String course){
        System.out.println(name + " is managing the " + course);
    }

    @Override
    public String getUserDetail(){
        return "Admin - Name : " + this.name + ", " + this.ID;
    }

    
}
