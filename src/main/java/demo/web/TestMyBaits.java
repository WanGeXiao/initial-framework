package demo.web;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import demo.domain.User;
import demo.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)             //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBaits {
	private ApplicationContext ac = null;
	
	@Resource
	  private IUserService userService = null;
	
	@Before
	  public void before() {
	          ac= new ClassPathXmlApplicationContext("spring-mybatis.xml");
	          userService= (IUserService) ac.getBean("userService");
	  }
	
	  protected Logger logger = Logger.getLogger(getClass());
	  @Test
	  public void test1() {
	    User user =userService.getUserById(1);
	    //System.out.println(user.getUserName());
	    // logger.info("值："+user.getUserName());
	   logger.info(JSON.toJSONString(user));
	  }
}
