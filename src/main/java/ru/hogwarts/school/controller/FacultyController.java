package ru.hogwarts.school.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.service.FacultyService;

@RestController
@RequestMapping("faculty")
public class FacultyController {

    FacultyService facultyService;

    @GetMapping("{id}")
    public ResponseEntity<Faculty> getFaculty (@PathVariable Long id) {
        Faculty faculty = facultyService.getFaculty(id);
        if (faculty == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(faculty);
    }

    @PostMapping()
    public Faculty postFaculty (@RequestBody Faculty faculty) {
        return facultyService.postFaculty(faculty);
    }

    @PutMapping
    public ResponseEntity<Faculty> putFaculty(Faculty faculty) {
        Faculty foundFaculty = facultyService.putFaculty(faculty);
        if (foundFaculty == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(foundFaculty);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteFaculty(@PathVariable Long id) {
        facultyService.deleteFaculty(id);
        return ResponseEntity.ok().build();
    }

//    @GetMapping("/colour")
//    public ResponseEntity<Collection<Faculty>> searchByColour (@RequestParam String colour) {
//        if (colour != null && !colour.isBlank()) {
//            return ResponseEntity.ok(facultyService.searchFacultyByColour(colour));
//        }
//        return ResponseEntity.ok(Collections.emptyList());
//    }
}
