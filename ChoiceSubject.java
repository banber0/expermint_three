// ChoiceSubject.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceSubject extends JFrame {
    private JList<String> subjectList;
    private JCheckBox[] checkBoxes;
    private JButton confirmButton;
    

     public ChoiceSubject() {
        setTitle("学生选课");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String[] subjects = {"课序号：1，课程名称：math，课程地点：class，课程时间：8：00，授课教师：工号：001，姓名：张老师，性别：M,学位：教授",
         "课序号：2，课程名称：english，课程地点：class，课程时间：10：00，授课教师：工号：002，姓名：李老师，性别：F,学位：教授",
         "课序号：3，课程名称：history，课程地点：class，课程时间：14：00，授课教师：工号：003，姓名：刘老师，性别：F,学位：教授",
         "课序号：4，课程名称：java，课程地点：class，课程时间：17：00，授课教师：工号：004，姓名：王老师，性别：M,学位：教授",
         "课序号：5，课程名称：python，课程地点：class，课程时间：18：00，授课教师：工号：005，姓名：牛老师，性别：M,学位：教授",
         };
        subjectList = new JList<>(subjects);
        subjectList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        checkBoxes = new JCheckBox[subjects.length];
        for (int i = 0; i < subjects.length; i++) {
            checkBoxes[i] = new JCheckBox(subjects[i]);
        }

        confirmButton = new JButton("确定");
        confirmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedSubjects = "选修的课程：";
                for (int i = 0; i < subjects.length; i++) {
                    if (checkBoxes[i].isSelected()) {
                        selectedSubjects += subjects[i] + " ";
                    }
                }
                // 假设当前登录的学生名字为"张三"
                FileOperations.writeFile("selected_subjects.txt", "张三: " + selectedSubjects);
                JOptionPane.showMessageDialog(null, "选课成功！", "提示", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
        });

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(subjectList), BorderLayout.CENTER);
        panel.add(confirmButton, BorderLayout.SOUTH);
        

        add(panel);
    }
}

