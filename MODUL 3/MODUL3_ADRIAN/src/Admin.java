public class Admin extends User {

    public Admin(String name, int ID) {
        super(name, ID);
    }

    public void manageSystem(String course){
        
    }

    @Override
    public String getUserDetail(){
        return "a";
    }

    
}
