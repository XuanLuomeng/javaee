import com.javaee.dao.StudentDao;
import com.javaee.po.Student;
import com.javaee.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class StudentCourseDaoTest {
    @Test
    public void findStudentCourseBySnoTest(){
        System.out.println("findStudentCourseBySnoTest:");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StudentDao studentCourseDao = sqlSession.getMapper(StudentDao.class);

        Student student = studentCourseDao.findStudentCourseBySno("100000001");
        System.out.println(student);
        sqlSession.close();
    }

}
