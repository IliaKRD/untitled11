import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Student {
    private String name;
    private String group;
    private int course;
    Map<String,Integer> ocenki;

    public Student(String name, String group, int course){
        this.name = name;
        this.group = group;
        this.course = course;
        this.ocenki = new HashMap<>();
    }

    public java.lang.String getName() {
        return name;
    }

    public java.lang.String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course){
        this.course = course;
    }

    public void setOcenka(String predmet, int ocenka) {
        ocenki.put(predmet, ocenka);
    }

    public int getOcenka(String predmet)
    {
        return ocenki.getOrDefault(predmet, -1);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", ocenki=" + ocenki +
                '}';
    }

    public double srednyaOcenka()
    {
        if (ocenki.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : ocenki.values()) {
            sum += grade;
        }
        return (double) sum / ocenki.size();
    }

}
