public class Teacher extends User {

    public Teacher(String name, int ID) {
        super(name, ID);
    }
    
    public void teachClass(String course){
        System.out.println(name + " is teaching " + course);
    }

    @Override
    public String getUserDetail(){
        return "Teacher - Name : " + this.name + ", " + this.ID;
    }

}
