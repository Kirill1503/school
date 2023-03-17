package ru.hogwarts.school.service;
//
//import org.springframework.stereotype.Service;
//import ru.hogwarts.school.model.Student;
//
//import java.util.HashMap;
//
//@Service
//public class StudentService {
//    private final HashMap<Long, Student> studentHashMap = new HashMap<>();
//
//    private long lastId = 0;
//
//    public Student getStudent (Long id) {
//        return studentHashMap.get(id);
//    }
//
//    public Student postStudent (Student student) {
//        student.setId(++lastId);
//        studentHashMap.put(lastId, student);
//        return student;
//    }
//
//    public Student putStudent(Student student) {
//        return studentHashMap.put(student.getId(), student);
//    }
//
//    public Student deleteStudent(Long id) {
//        return studentHashMap.remove(id);
//    }
//}
