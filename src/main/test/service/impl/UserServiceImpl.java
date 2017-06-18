import javax.annotation.Resource;
 
import org.springframework.stereotype.Service;
 
import com.cn.hnust.dao.IUserDao;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;
 
@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	  privateIUserDao userDao;
	  @Override
	  publicUser getUserById(int userId) {
	    // TODO Auto-generated method stub
	    return this.userDao.selectByPrimaryKey(userId);
	  }
}
