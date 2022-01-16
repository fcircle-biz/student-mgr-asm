package biz.fcircle.studentmgrwebservices.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import biz.fcircle.studentmgrwebservices.model.Student;
import biz.fcircle.studentmgrwebservices.model.StudentC;

@Mapper
public interface StudentMapper {
    
    public List<Student> findByCondition(StudentC studentC);
 
}
