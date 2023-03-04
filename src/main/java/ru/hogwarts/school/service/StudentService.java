package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class StudentService {
    private final HashMap<Long, Student> studentHashMap = new HashMap<>();

    private long lastId = 0;

    public Student getStudent(Long id) {
        return studentHashMap.get(id);
    }

    public Student postStudent(Student student) {
        student.setId(++lastId);
        studentHashMap.put(lastId, student);
        return student;
    }

    public Student putStudent(Student student) {
        return studentHashMap.put(student.getId(), student);
    }

    public Student deleteStudent(Long id) {
        return studentHashMap.remove(id);
    }

    public Collection<Student> searchStudentByAge(int age) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : studentHashMap.values()) {
            if (student.getAge() == age) {
                result.add(student);
            }
        }
        return result;
    }
}
