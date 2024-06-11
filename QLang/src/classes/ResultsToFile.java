package classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class ResultsToFile {
    private HashMap<Student, FinalGrade> studentsResults;
    private String filePath;

    public ResultsToFile(HashMap<Student, FinalGrade> studentsResults, String filePath) {
        this.studentsResults = studentsResults;
        this.filePath = filePath;
    }

    public void writeResultsToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Student student : studentsResults.keySet()) {
                FinalGrade grade = studentsResults.get(student);
                String resultLine = "Student: " + student.getName() + ", Score: " + grade + "\n";
                writer.write(resultLine);
            }
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}