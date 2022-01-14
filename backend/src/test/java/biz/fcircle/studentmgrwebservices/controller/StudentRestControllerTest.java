package biz.fcircle.studentmgrwebservices.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

@SpringBootTest
@AutoConfigureMockMvc
public class StudentRestControllerTest {
    
	private static final Logger logger = LoggerFactory.getLogger(StudentRestControllerTest.class);
    
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGet_StudentList_Ok() throws Exception {
        String name = "山田";
        ResultActions actions = mockMvc.perform(get("/api/studentList?studentName={name}", name));
        actions.andExpect(status().isOk());

        MockHttpServletResponse response = actions.andReturn().getResponse();
        response.setCharacterEncoding("UTF-8");
        logger.debug(response.getContentAsString());
    }
}
