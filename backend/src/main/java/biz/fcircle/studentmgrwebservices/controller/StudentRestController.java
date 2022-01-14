package biz.fcircle.studentmgrwebservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import biz.fcircle.studentmgrwebservices.model.Student;
import biz.fcircle.studentmgrwebservices.model.StudentC;
import biz.fcircle.studentmgrwebservices.service.StudentService;

@RestController
@RequestMapping("api")
public class StudentRestController {
    
    @Autowired
    private StudentService studentService;

    @GetMapping("studentList")
    public List<Student> studentList(
        @RequestParam(name="studentName", required=false) String studentName
        , @RequestParam(name="prefId", required=false) String prefId) {

        StudentC studentC = new StudentC();
        studentC.setStudentName(studentName);
        studentC.setPrefId(prefId);

        return studentService.findByCondition(studentC);
    }
}
