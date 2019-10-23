import com.cp.dao.UserMapper;
import com.cp.pojo.User;
import com.cp.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void queryUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
        sqlSession.close();
        System.out.println("=====================");
//        mapper.updateUser(new User(2,"小黄","123456"));
        //手动清除缓存
//        sqlSession.clearCache();
        System.out.println("=====================");
        User user2 = mapper2.queryUserById(1);
        System.out.println(user2);

        System.out.println(user == user2);
        sqlSession2.close();
    }
}
