package model;
import exceptions.CourseFullException;
import exceptions.GPATooLowException;
import exceptions.MissingPrereqException;
import exceptions.NoCoursesTakenException;

import java.util.List;

public class Registrar {

    private String name;
    private List<Transcript> students;

    public Registrar(String name) {
        // TODO: complete the implementation of this method
    }

    // getters
    public String getName() {
        // TODO: complete the implementation of this method
        return null;
    }
    public List<Transcript> getStudents() {
        // TODO: complete the implementation of this method
        return null;
    }

    // MODIFIES: this
    // EFFECTS: returns true if the student (represented as a transcript) was successfully added to the
    //          Registrar's list. Remember to check if the student already exists in the list
    public boolean addStudent(Transcript stu) {
        // TODO: complete the implementation of this method
        return false;
    }

    //REQUIRES: that the student represented by the transcript has the necessary prerequisite required
    //          to take the course, and the course is not full
    // EFFECTS: registers a given student represented by tct to a course c.
    public boolean registerStudent(Course c, Transcript tct) throws CourseFullException, MissingPrereqException {
        // TODO: complete the implementation of this method
        return false;
    }

    // EFFECTS: promotes all students to their next year level.
    public void promoteAllStudents() throws GPATooLowException, NoCoursesTakenException {
        // TODO: complete the implementation of this method
    }


}