package ru.hogwarts.school.controller;
//
//import org.springframework.web.bind.annotation.*;
//import ru.hogwarts.school.model.Student;
//import ru.hogwarts.school.service.StudentService;
//
//@RestController
//@RequestMapping("student")
//public class StudentController {
//
//    StudentService studentService = new StudentService();
//
//    @GetMapping("{id}")
//    public Student getStudent (@PathVariable Long id) {
//        return studentService.getStudent(id);
//    }
//
//    @PostMapping()
//    public Student postStudent (@RequestBody Student student) {
//        return studentService.postStudent(student);
//    }
//
//    @PutMapping
//    public Student putStudent(Student student) {
//        return studentService.putStudent(student);
//    }
//
//    @DeleteMapping("{id}")
//    public Student deleteStudent(@PathVariable Long id) {
//        return studentService.deleteStudent(id);
//    }
//}
