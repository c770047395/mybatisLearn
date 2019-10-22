import com.cp.dao.StudentMapper;
import com.cp.dao.TeacherMapper;
import com.cp.pojo.Student;
import com.cp.pojo.Teacher;
import com.cp.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudentList2();
        for (Student student:studentList){
            System.out.println(student);

        }
        sqlSession.close();
    }

}
