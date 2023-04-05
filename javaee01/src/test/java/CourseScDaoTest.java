import com.javaee.dao.CourseScDao;
import com.javaee.po.Course;
import com.javaee.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class CourseScDaoTest {
    @Test
    public void findStudentScBySnoTest(){
        System.out.println("findStudentScBySnoTest:");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CourseScDao courseScDao = sqlSession.getMapper(CourseScDao.class);
        Course courseScByCno = courseScDao.findCourseScByCno("1");
        System.out.println(courseScByCno);
        sqlSession.close();
    }
}
