import com.cp.dao.BlogMapper;
import com.cp.pojo.Blog;
import com.cp.util.IDutils;
import com.cp.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyTest {
    @Test
    public void insert(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDutils.getId());
        blog.setAuthor("CP");
        blog.setCreateTime(new Date());
        blog.setTitle("Mybatis");
        blog.setViews(9990);
        mapper.addBlog(blog);

        blog.setId(IDutils.getId());
        blog.setAuthor("CPpp");
        blog.setCreateTime(new Date());
        blog.setTitle("Java");
        blog.setViews(100);
        mapper.addBlog(blog);


        blog.setId(IDutils.getId());
        blog.setAuthor("CPpp1");
        blog.setCreateTime(new Date());
        blog.setTitle("tomcat");
        blog.setViews(1002);
        mapper.addBlog(blog);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void queryBlogByIF(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("title","Mybatis真好玩");
        map.put("author","cp11");
        List<Blog> blogList = mapper.queryBlogIF(map);
        for(Blog blog : blogList){
            System.out.println(blog);
        }

        sqlSession.close();
    }

    @Test
    public void queryBlogByChoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("title","Mybatis");
//        map.put("author","cp");
        map.put("views",9990);
        List<Blog> blogList = mapper.queryBlogChoose(map);
        for(Blog blog : blogList){
            System.out.println(blog);
        }

        sqlSession.close();
    }

    @Test
    public void updateBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("title","Mybatis真好玩");
        map.put("author","cp11");
        map.put("id","df9f25ca6d004e5b8c120f6e64a6d8cb");
        mapper.updateBlog(map);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void queryBlogForeach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        ArrayList<String> idList = new ArrayList<String>();
        idList.add("1");
        idList.add("2");
        idList.add("3");
        map.put("ids",idList);
        List<Blog> blogList = mapper.queryBlogForeach(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
