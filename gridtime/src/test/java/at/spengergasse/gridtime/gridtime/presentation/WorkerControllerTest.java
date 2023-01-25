package at.spengergasse.gridtime.gridtime.presentation;

import at.spengergasse.gridtime.gridtime.service.WorkerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@EnableWebMvc
@AutoConfigureMockMvc
class WorkerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private WorkerService workerService;

    @Test
    void verifyPost() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders
                .post("/workers")
                .contentType("application/json")
                .content("""
                    {"name":"Hanis"}
                    """))
                .andDo(print())
                .andExpect(status().isOk());
    }

}