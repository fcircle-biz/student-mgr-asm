package biz.fcircle.studentmgrwebservices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentServiceTest {
    
	private static final Logger logger = LoggerFactory.getLogger(StudentServiceTest.class);
    
    @Autowired
    private StudentService studentService;

    @Test
    public void testFindByCondition() {
        StudentC cond = new StudentC();
        cond.setStudentName("山田");

        List<Student> list = studentService.findByCondition(cond);
        for (Student student : list) {
            logger.debug(student.toString());
        }

        assertEquals(list.size(), 1);
        assertEquals(list.get(0).getStudentName(), "山田　太郎");
    }    
}
