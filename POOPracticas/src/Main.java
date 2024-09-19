import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de StudentService
        StudentService studentService = new StudentService();

        // Añadir estudiantes
        studentService.students.put("1030", new Student("Carlos", "1030", 31));
        studentService.students.put("1040", new Student("Ian", "1040", 28));
        studentService.students.put("1050", new Student("Elise", "1050", 26));
        studentService.students.put("1020", new Student("Santiago", "1020", 33));

        
        studentService.enrollStudents("Math", "1030");
        studentService.enrollStudents("Physics", "1040");

       
        studentService.showAllCourses();

        
        studentService.showEnrolledStudents("Math");
    }


public class InnerMain {
    HashMap<String, Course> courseList = new HashMap<>();
    HashMap<String, Student> students = new HashMap<>();
    HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();

    public InnerMain() {
        courseList.put("Math", new Course("Math", 10, "Aurelio Baldor"));
        courseList.put("Physics", new Course("Physics", 10, "Albert Einstein"));
        courseList.put("Art", new Course("Art", 10, "Pablo Picasso"));
        courseList.put("History", new Course("History", 10, "Sima Qian"));
        courseList.put("Biology", new Course("Biology", 10, "Charles Darwin"));
    }

    public void enrollStudents(String courseName, String studentID) {
        Course course = courseList.get(courseName);

        if (!coursesEnrolledByStudents.containsKey(studentID)) {
            coursesEnrolledByStudents.put(studentID, new ArrayList<>());
        }
        coursesEnrolledByStudents.get(studentID).add(course);
    }

    public void unEnrollStudents(String courseName, String studentID) {
        Course course = courseList.get(courseName);

        if (coursesEnrolledByStudents.containsKey(studentID)) {
            coursesEnrolledByStudents.get(studentID).remove(course);
        }
    }

    public void showEnrolledStudents(String courseId) {
        Course course = courseList.get(courseId);
        if (course == null) {
            System.out.println("Course not found.");
            return;
        }

        System.out.println("Students enrolled in " + course.getName() + ":");

        boolean studentFound = false;
        for (String studentId : coursesEnrolledByStudents.keySet()) {
            List<Course> enrolledCourses = coursesEnrolledByStudents.get(studentId);
            if (enrolledCourses.contains(course)) {
                Student student = students.get(studentId);
                System.out.println("- " + student.getName() + " (ID: " + student.getId() + ")");
                studentFound = true;
            }
        }

        if (!studentFound) {
            System.out.println("No hay estudiantes registrados en este curso.");
        }
    }

    public void showAllCourses() {
        System.out.println("Cursos Disponibles: ");
        
        for (Course course : courseList.values()) {
            System.out.println("- " + course.getName() + " (Exponentes " + course.getInstructor() + ", Créditos " + course.getDuration() + "Totales");
        }
    }
}

}