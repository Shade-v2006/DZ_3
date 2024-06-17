package DZ.DZ_3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import DZ.DZ_3.data.Student;
import DZ.DZ_3.data.StudentGroup;
import DZ.DZ_3.data.Teacher;

public class Program {
    public static void main(String[] args) {

        Student van = new Student("Sasha", "Ivanov", "Vasilyevich", LocalDate.of(2010, 2, 24));
        Student van2 = new Student("Pasha", "Petrov", "Ivanovich", LocalDate.of(2011, 2, 24));
        Teacher teacher = new Teacher("Vas", "Li", "Zo", LocalDate.of(2002, 2, 2));

        ArrayList<Student> arrayList = new ArrayList<>(List.of(van, van2));

        StudentGroup studentGroup = new StudentGroup(teacher, arrayList);
        

        System.out.println(studentGroup);

        // System.out.println("студенты " + studentGroup.students);
        // Iterator<Student> iterator = new StudentGroupIterator(studentGroup);

        // while (iterator.hasNext()) {
        // System.out.println(iterator.next());
        // }

    }
}
