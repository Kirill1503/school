package ru.hogwarts.school.service;


import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Collectors;

@Service
public class FacultyService {

    private final HashMap<Long, Faculty> facultyHashMap = new HashMap<>();

    private long lastId = 0;

    public Faculty getFaculty (Long id) {
        return facultyHashMap.get(id);
    }

    public Faculty postFaculty (Faculty faculty) {
        faculty.setId(++lastId);
        facultyHashMap.put(lastId, faculty);
        return faculty;
    }

    public Faculty putFaculty (Faculty faculty) {
        return facultyHashMap.put(faculty.getId(), faculty);
    }

    public Faculty deleteFaculty (Long id) {
        return facultyHashMap.remove(id);
    }

    public Collection<Faculty> searchFacultyByColour(String colour) {
        ArrayList<Faculty> result = new ArrayList<>();
        for (Faculty faculty : facultyHashMap.values()) {
            if (faculty.getColour().equals(colour)) {
                result.add(faculty);
            }
        }
        return result;
    }
}
