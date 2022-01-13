package biz.fcircle.studentmgrwebservices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Student {
    
	private int studentId;
	private String studentName;
	private String genderCd;
	private Integer prefId;
	private Integer age;
	private Date birthday;
	private List<ReceiveSubject> receiveSubjectList = new ArrayList<>();
}
