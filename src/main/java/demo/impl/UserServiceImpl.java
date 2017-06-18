package demo.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import demo.IDao.UserMapper;
import demo.domain.User;
import demo.service.IUserService;
  
@Service("userService")
public class UserServiceImpl implements IUserService {

	 @Resource
	  private  UserMapper userDao;

	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	 
}
