
import java.io.Serializable;

public class CourseNotFoundException extends Exception implements Serializable {

   
    private static final long serialVersionUID = 1L;

    public CourseNotFoundException(String message) {
        super(message);
    }
}