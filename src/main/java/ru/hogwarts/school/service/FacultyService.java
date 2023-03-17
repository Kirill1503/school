package ru.hogwarts.school.service;


import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.repositories.FacultyRepository;


@Service
public class FacultyService {


    FacultyRepository facultyRepository;

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty getFaculty (Long id) {
        return facultyRepository.findById(id).get();
    }

    public Faculty postFaculty (Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public Faculty putFaculty (Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public void deleteFaculty (Long id) {
        facultyRepository.deleteById(id);
    }

//    public Collection<Faculty> searchFacultyByColour(String colour) {
//        ArrayList<Faculty> result = new ArrayList<>();
//        for (Faculty faculty : facultyHashMap.values()) {
//            if (faculty.getColour().equals(colour)) {
//                result.add(faculty);
//            }
//        }
//        return result;
//    }
}
