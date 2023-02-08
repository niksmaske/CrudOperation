//package com.user.cruddemo;
//
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.fail;
//
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpStatus;
//import org.springframework.mock.web.MockHttpServletResponse;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import com.prog.EmpSystemApplication;
//
//import ch.qos.logback.classic.Logger;
//
//@SpringBootTest(classes = EmpSystemApplication.class)
///* (webEnvironment = WebEnvironment.MOCK) */
//@DisplayName("spring user test") // custom display name for the annotated test class
//@AutoConfigureMockMvc // configure the web layer for testing
//@AutoConfigureWebMvc
//@ContextConfiguration
//@RunWith(SpringRunner.class)
//class FullstackBackendApplicationTests {
//	private Logger log = (Logger) LoggerFactory.getLogger(FullstackBackendApplicationTests.class);
//
//	@Autowired
//	private MockMvc mockmvc; // MockMvc is defined as a main entry point for server-side Spring MVC testing.
//
//	@Test // run as a test case.
//	@Disabled // use to disabled method
//	@DisplayName("Get only user by id")
//	public void testGetOne() throws Exception {
//		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/user/2");
//
//		MvcResult result = mockmvc.perform(request).andReturn();
//
//		MockHttpServletResponse response = result.getResponse();
//
//		assertEquals(HttpStatus.OK.value(), response.getStatus());
//		assertNotNull(response.getContentAsString());
//
//		if (!response.getContentType().contains("application/json")) {
//			fail("may be not json data!");
//		}
//		log.info(response.getContentAsString());
//	}
//
//	@Test
//	@Disabled
//	@DisplayName("Fetch all users")
//	public void testGetAll() throws Exception {
//		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/users");
//
//		MvcResult result = mockmvc.perform(request).andReturn();
//
//		MockHttpServletResponse response = result.getResponse();
//
//		assertEquals(HttpStatus.OK.value(), response.getStatus());
//		assertNotNull(response.getContentAsString());
//
//		if (!response.getContentType().contains("application/json")) {
//			fail("may be not json data!");
//		}
//	}
//
//	@Test
//	@Disabled
//	@DisplayName("SAVE USER")
//	public void testSave() throws Exception {
//		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/user")
//				.header("Content-Type", "application/json")
//				.content("{\"name\":\"nikhil\",\"username\":\"nik\",\"email\":\"niks1137@gmail.com\"}");
//
//		MvcResult result = mockmvc.perform(request).andReturn();
//
//		MockHttpServletResponse response = result.getResponse();
//
//		assertEquals(HttpStatus.OK.value(), response.getStatus());
//		assertNotNull(response.getContentAsString());
//
//		if (!response.getContentAsString().contains("created successfully")) {
//			fail("User may not be saved");
//		}
//		log.info(response.getContentAsString());
//	}
//
//	@Test
//	@Disabled
//	@DisplayName("UPDATE USER")
//	public void testUpdate() throws Exception {
//		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/user")
//				.header("Content-Type", "application/json")
//				.content("{\"name\":\"nikhil\",\"username\":\"nik\",\"email\":\"niks1137@gmail.com\"}");
//
//		MvcResult result = mockmvc.perform(request).andReturn();
//
//		MockHttpServletResponse response = result.getResponse();
//
//		assertEquals(HttpStatus.OK.value(), response.getStatus());
//		assertNotNull(response.getContentAsString());
//
//		if (!response.getContentAsString().contains("created successfully")) {
//			fail("User may not be saved");
//		}
//		log.info(response.getContentAsString());
//	}
//
//	/*
//	 * @Test
//	 * 
//	 * @DisplayName("REMOVE  BY ID") public void testDeleteOne() throws Exception {
//	 * MockHttpServletRequestBuilder request =
//	 * MockMvcRequestBuilders.get("/user/2");
//	 * 
//	 * MvcResult result = mockmvc.perform(request).andReturn();
//	 * 
//	 * MockHttpServletResponse response = result.getResponse();
//	 * 
//	 * assertEquals(HttpStatus.OK.value(), response.getStatus());
//	 * assertNotNull(response.getContentAsString());
//	 * 
//	 * if (!response.getContentAsString().contains("deleted")) {
//	 * fail("user might not be deleted"); } }
//	 */
//
//}
