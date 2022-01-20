package pl.favael.jenkinsspringexample;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class JenkinsSpringExampleApplicationTests {

	@Autowired
	private MockMvc mockMvc;





	@Test
	void shouldReturnDefaultMessage() throws Exception {

		this.mockMvc.perform(MockMvcRequestBuilders
				.get("/job"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string("Good job Raf!"));

	}
}
