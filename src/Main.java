import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();

        Student student1 = new Student("Иванов", "Группа А", 1);
        student1.setOcenka("Математика", 5);
        student1.setOcenka("Физика", 4);

        students.add(student1);

        Student student2 = new Student("Петров", "Группа Б", 2);
        student2.setOcenka("Математика", 4);
        student2.setOcenka("Физика", 3);
        students.add(student2);

        Student student3 = new Student("Сидорова", "Группа В", 1);
        student3.setOcenka("Математика", 3);
        student3.setOcenka("Физика", 5);
        students.add(student3);

        Student student4 = new Student("Андреев", "Группа Г", 1);
        student4.setOcenka("Математика", 3);
        student4.setOcenka("Физика", 2);
        students.add(student4);

        System.out.println(student2.srednyaOcenka());

        Main main = new Main();
        main.otchislenie(students);

        for (Student student: students)
        {
            System.out.println(student);
        }

        main.perevod(students);
        for (Student student: students)
        {
            System.out.println(student);
        }

        main.printStudents(students,2);

    }

    public void otchislenie(List<Student> students)
    {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext())
        {
            Student student = iterator.next();
            if (student.srednyaOcenka() < 3.0)
            {
                iterator.remove();
            }
        }
    }

    public void perevod(List<Student> students)
    {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext())
        {
            Student student = iterator.next();
            if (student.srednyaOcenka() >= 3.0)
            {
                student.setCourse(student.getCourse()+1);
            }
        }
    }

    public void printStudents(List<Student> students, int course)
    {
        System.out.println("Студенты на курсе " + course + ":");
        for (Student student : students)
        {
            if (student.getCourse() == course)
            {
                System.out.println(student.getName());
            }
        }
    }

}
