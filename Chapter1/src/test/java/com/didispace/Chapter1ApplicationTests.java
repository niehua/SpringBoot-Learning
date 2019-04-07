package com.didispace;
/**
 * 基本项目构建（可作为工程脚手架），引入web模块，完成一个简单的RESTful API
 */

import com.didispace.web.HelloController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringJUnit4ClassRunner.class)
// classes ：可以是Spring Boot的启动类，也可以使用MockServletContext来构建一个空的WebApplicationContext，
// 这样我们创建的StudentController就可以在@Before函数中创建并传递到MockMvcBuilders.standaloneSetup（）函数中。
@SpringApplicationConfiguration(classes = MockServletContext.class)
@WebAppConfiguration//用来表示测试环境使用的ApplicationContext将是WebApplicationContext类型的
public class Chapter1ApplicationTests {

	private MockMvc mvc;

	@Before//每个测试方法前执行，作用:初始化方法  @BeforeClass所有测试方法执行前.执行一次，作用:整体初始化
	public void setUp(){
		//通过参数指定一组控制器，这样就不需要从上下文获取了；
		//直接使用静态工厂MockMvcBuilders创建即可：
		//模拟一个Mvc测试环境
		mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
	}

	@Test
	public void getHello() throws Exception {
		//perform：执行一个RequestBuilder请求，会自动执行SpringMVC的流程并映射到相应的控制器执行处理；
		mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("Hello World")));
	}

}
