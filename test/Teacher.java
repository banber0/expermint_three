package test;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

import example.People;

public class Teacher extends People {
    private List<Subject> teachingSubjects;

    public Teacher(int id, String name, String sex,int age, String subject) {
        super(id, name, sex,age);
        teachingSubjects = new ArrayList<>();
    }



    public List<Subject> getTeachingSubjects() {
        return teachingSubjects;
    }
     public void verifyAccessControl() {
        
        liu(); // 可见
        //从People类访问私有方法
        ze(); 
        xu();//不可见，私有方法在子类中不可见。.
        
    }
}
