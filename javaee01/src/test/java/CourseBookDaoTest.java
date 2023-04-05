import com.javaee.dao.CourseBookDao;
import com.javaee.po.Course;
import com.javaee.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class CourseBookDaoTest {
    @Test
    public void findCourseBookByCnoTest(){
        System.out.println("findCourseBookByCnoTest:");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CourseBookDao courseBookDao = sqlSession.getMapper(CourseBookDao.class);

        Course course = courseBookDao.findCourseBookByCno(1);
        System.out.println(course);
        sqlSession.close();
    }
}
