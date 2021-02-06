package it.esedra.corso.api;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import it.esedra.corso.api.service.EmployeeService;

@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;
    
    //@MockBean
   // private EmployeeService employeeService;

    @Test
    public void testGetEmployees() throws Exception {
        mockMvc.perform(get("/employees"));
         //   .andExpect(status().isOk());
           // .andExpect(view().name("home"))
           // .andExpect(jsonPath("$[0].firstName", is("Laurent")));
    }

}
