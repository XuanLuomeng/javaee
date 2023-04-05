import com.javaee.dao.IdCardStusentDao;
import com.javaee.po.Student;
import com.javaee.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class StudentIdCardDaoTest {
    @Test
    public void findCourseBookByCnoTest() {
        System.out.println("findStudentIdCardBySnoTest:");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        IdCardStusentDao idCardStusentDao = sqlSession.getMapper(IdCardStusentDao.class);

        Student student = idCardStusentDao.findStudentIdCardBySno("100000001");
        System.out.println(student);
        sqlSession.close();
    }
}
