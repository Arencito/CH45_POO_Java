
	public class Course
	{
		 private String name;
		    private int credits;
		    private String instructor;

		    public Course(String name, int duration, String instructor) {
		        this.name = name;
		        this.credits = duration;
		        this.instructor = instructor;
		    }

		  
		    public String getName() {
		        return name;
		    }

		    
		    public int getDuration() {
		        return credits;
		    }

		   
		    public String getInstructor() {
		        return instructor;
		    }
		}

