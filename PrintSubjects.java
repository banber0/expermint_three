
import javax.swing.*;


public class PrintSubjects extends JFrame {
    private JTextArea subjectTextArea;

    public PrintSubjects() {
        setTitle("课程打印");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String selectedSubjects = FileOperations.readFile("selected_subjects.txt");

        subjectTextArea = new JTextArea(selectedSubjects);
        subjectTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(subjectTextArea);

        add(scrollPane);
        
        // 设置窗口可见
        setVisible(true);
    }
}
