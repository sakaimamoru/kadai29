package raisetech.student.management;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter

public class StudentCourses {

    private String id;
    private String student_id;
    private String course;
    private LocalDateTime start_time;
    private LocalDateTime finish_time;


}
