import java.util.ArrayList;

public class Student extends User {
    protected ArrayList<String> enrolledCourse = new ArrayList<String>();

    public Student(String name, int ID, ArrayList<String> enrolledCourse) {
        super(name, ID);
        this.enrolledCourse = enrolledCourse;
    }
    
    public void enrollCourse(String course){
        
    }

    @Override
    public String getUserDetail(){
        return "a";
    }

}
