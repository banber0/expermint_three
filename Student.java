import java.util.ArrayList;
import java.util.List;

public class Student extends People {
    private List<Subject> selectedSubjects;

    public Student(int id, String name, String sex,int age) {
        super(id, name, sex,age);
        selectedSubjects = new ArrayList<>();
    }

    public void selectSubject(Subject subject) {
        if (!selectedSubjects.contains(subject)) {
            selectedSubjects.add(subject);
            subject.addStudent(this); // Update the subject to include the student
        }
    }

    public void dropSubject(Subject subject) {
        selectedSubjects.remove(subject);
        subject.removeStudent(this); // Update the subject to remove the student
    }

    public List<Subject> getSelectedSubjects() {
        return selectedSubjects;
    }

    // Other methods and properties specific to students can be added.
}
