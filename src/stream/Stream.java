package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {


    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<Student>();
        student.add(new Student(100, "Yang"));
        student.add(new Student(100, "Lee"));
        student.add(new Student(80, "Cho"));
        student.add(new Student(70, "kim"));
        student.add(new Student(60, "Yan"));

//        student.stream().filter(s -> s.getScore() > 70).forEach(s -> System.out.println(s.getStudentNm()));

        Map<Integer, List<Student>> map = student.stream().collect(Collectors.groupingBy(Student::getScore));


        List<Student> perfect = map.get(100);perfect.forEach(s-> System.out.println(s.getStudentNm()));




    }

}