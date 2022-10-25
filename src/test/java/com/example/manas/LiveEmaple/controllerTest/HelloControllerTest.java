package com.example.manas.LiveEmaple.controllerTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.manas.LiveEmaple.helloWorld.HelloController;
import com.example.manas.LiveEmaple.helloWorld.HelloFunctions;


/*Use @RunWith(SpringRunner.class) if you are using Junit4*/
@WebMvcTest(HelloController.class) /*Calling WebMcv on desired controller*/
class HelloControllerTest {
	@Autowired
	private MockMvc mockMvc;
	

	@Test
	public void Test_helloWorld() throws Exception {
		//Test /hello URI
		//This tells us we want to hit URL "/hello" with GET method and we want response in JSON format
		RequestBuilder request = MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(request).andExpect(status().isOk()).andReturn();
		//verify the result
		assertEquals("Hello world",result.getResponse().getContentAsString());	

	}

	@Test
	public void Test_HelloBean() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.get("/hellomessage").accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(request).andExpect(status().isOk()).
				andExpect(content().json("{\"id\":2,\"message\":\"I am Springboot\",\"amount\":123.0}")).
				andReturn();


	}
	
}

