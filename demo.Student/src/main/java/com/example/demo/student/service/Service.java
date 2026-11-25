
 com.example.demo.student.Service;

	import java.util.List;
	import com.example.demo.student.model.Student;

	public interface Service {

	    // Create student
	    Student saveStudent(Student student);

	    // Get all students
	    List<Student> getAllStudents();

	    // Get student by ID
	    Student getStudentById(int id);

	    // Update student
	    Student updateStudent(int id, Student student);

	    // Delete student
	    void deleteStudent(int id);

	}
	
	

	

}
