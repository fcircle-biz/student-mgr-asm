package biz.fcircle.studentmgrwebservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import biz.fcircle.studentmgrwebservices.mapper.StudentMapper;
import biz.fcircle.studentmgrwebservices.model.Student;
import biz.fcircle.studentmgrwebservices.model.StudentC;

@Service
@Transactional
public class StudentService {
    
    @Autowired
    private StudentMapper studentMapper;

    public List<Student> findByCondition(StudentC studentC) {

        return studentMapper.findByCondition(studentC);
    }

}
