package biz.fcircle.studentmgrwebservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentService {
    
    @Autowired
    private StudentMapper studentMapper;

    public List<Student> findByCondition(StudentC studentC) {

        return studentMapper.findByCondition(studentC);
    }

}
