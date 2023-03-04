package ru.hogwarts.school.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.service.StudentService;

import java.util.Collection;
import java.util.Collections;

@RestController
@RequestMapping("student")
public class StudentController {

    StudentService studentService = new StudentService();

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("{id}")
    public Student getStudent (@PathVariable Long id) {
        return studentService.getStudent(id);
    }

    @PostMapping()
    public Student postStudent (@RequestBody Student student) {
        return studentService.postStudent(student);
    }

    @PutMapping
    public Student putStudent(Student student) {
        return studentService.putStudent(student);
    }

    @DeleteMapping("{id}")
    public Student deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }

    @GetMapping("/age")
    public ResponseEntity<Collection<Student>> searchByAge (@RequestParam int age) {
        if (age > 0) {
            return ResponseEntity.ok(studentService.searchStudentByAge(age));
        }
        return ResponseEntity.ok(Collections.emptyList());
    }
}
