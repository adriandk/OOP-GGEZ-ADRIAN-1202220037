public class Teacher extends User {

    public Teacher(String name, int ID) {
        super(name, ID);
    }
    
    public void teachClass(String course){
        
    }

    @Override
    public String getUserDetail(){
        return "a";
    }

}
