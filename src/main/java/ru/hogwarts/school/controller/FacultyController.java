package ru.hogwarts.school.controller;
//
//import org.springframework.web.bind.annotation.*;
//import ru.hogwarts.school.model.Faculty;
//import ru.hogwarts.school.service.FacultyService;
//
//@RestController
//@RequestMapping("faculty")
//public class FacultyController {
//
//    FacultyService facultyService = new FacultyService();
//
//    @GetMapping("{id}")
//    public Faculty getStudent (@PathVariable Long id) {
//        return facultyService.getFaculty(id);
//    }
//
//    @PostMapping()
//    public Faculty postStudent (@RequestBody Faculty faculty) {
//        return facultyService.postFaculty(faculty);
//    }
//
//    @PutMapping
//    public Faculty putStudent(Faculty faculty) {
//        return facultyService.putFaculty(faculty);
//    }
//
//    @DeleteMapping("{id}")
//    public Faculty deleteStudent(@PathVariable Long id) {
//        return facultyService.deleteFaculty(id);
//    }
//}
