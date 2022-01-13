package biz.fcircle.studentmgrwebservices;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    
    public List<Student> findByCondition(StudentC studentC);
 
}
