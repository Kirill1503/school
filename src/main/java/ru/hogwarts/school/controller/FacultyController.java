package ru.hogwarts.school.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.service.FacultyService;

import java.util.Collection;
import java.util.Collections;

@RestController
@RequestMapping("faculty")
public class FacultyController {

    FacultyService facultyService = new FacultyService();

    @GetMapping("{id}")
    public Faculty getStudent (@PathVariable Long id) {
        return facultyService.getFaculty(id);
    }

    @PostMapping()
    public Faculty postStudent (@RequestBody Faculty faculty) {
        return facultyService.postFaculty(faculty);
    }

    @PutMapping
    public Faculty putStudent(Faculty faculty) {
        return facultyService.putFaculty(faculty);
    }

    @DeleteMapping("{id}")
    public Faculty deleteStudent(@PathVariable Long id) {
        return facultyService.deleteFaculty(id);
    }

    @GetMapping("/colour")
    public ResponseEntity<Collection<Faculty>> searchByColour (@RequestParam String colour) {
        if (colour != null && !colour.isBlank()) {
            return ResponseEntity.ok(facultyService.searchFacultyByColour(colour));
        }
        return ResponseEntity.ok(Collections.emptyList());
    }
}
