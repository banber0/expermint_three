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

    //public void addTeachingSubject(Subject subject) {
    //    teachingSubjects.add(subject);
    //    subject.setTeacher(this); //更新科目以包括教师
    //}

    public List<Subject> getTeachingSubjects() {
        return teachingSubjects;
    }

    // 可以添加教师特有的其他方法和属性
     public void verifyAccessControl() {
        
        liu(); // 这是允许的

        //尝试从People类访问私有方法（这不会编译）
        ze(); // 不可见.
        xu();//不可见，私有方法在子类中不可见。.
        
    }
}
