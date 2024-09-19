
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentService
{
    HashMap<String, Course> courseList = new HashMap<>();

    HashMap<String, Student> students = new HashMap<>();

    HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();


    public StudentService()
    {
        courseList.put( "Math", new Course( "Math", 10, "Aurelio Baldor" ) );
        courseList.put( "Physics", new Course( "Physics", 10, "Albert Einstein" ) );
        courseList.put( "Art", new Course( "Art", 10, "Pablo Picasso" ) );
        courseList.put( "History", new Course( "History", 10, "Sima Qian" ) );
        courseList.put( "Biology", new Course( "Biology", 10, "Charles Darwin" ) );
    }

    public void enrollStudents( String courseName, String studentID )
    {
        Course course = courseList.get( courseName );

        if ( !coursesEnrolledByStudents.containsKey( studentID ) )
        {
            coursesEnrolledByStudents.put( studentID, new ArrayList<>() );
        }
        coursesEnrolledByStudents.get( studentID ).add( course );
    }

    public void unEnrollStudents( String courseName, String studentID )
    {
        Course course = courseList.get( courseName );

        if ( coursesEnrolledByStudents.containsKey( studentID ) )
        {
            coursesEnrolledByStudents.get( studentID ).remove( course );
        }
    }
    
    public void showEnrolledStudents(String courseId) {
        Course course = courseList.get(courseId);
        if (course == null) {
            System.out.println("Curso no encontrado");
            return;
        }

        System.out.println("Estudiantes registrados en " + course.getName() + ":");

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

    public void showAllCourses(){
    	
    	//TODO implement using collections loops
     
    	System.out.println("Cursos Disponibles:");
        
        for (Course course : courseList.values()) {
            System.out.println("- " + course.getName() + " (Exponentes principales: " + course.getInstructor() + ", Créditos: " + course.getDuration() + " Totales" );
        }
    	
		
    }
}
