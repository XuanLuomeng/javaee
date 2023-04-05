import com.javaee.dao.CourseStudentDao;
import com.javaee.po.Course;
import com.javaee.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class CourseStudentDaoTest {
    @Test
    public void findStudentCourseBySnoTest(){
        System.out.println("findStudentCourseBySnoTest:");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CourseStudentDao courseStudentDao = sqlSession.getMapper(CourseStudentDao.class);

        Course course = courseStudentDao.findCourseStudentByCno(1);
        System.out.println(course);
        sqlSession.close();
    }
}
