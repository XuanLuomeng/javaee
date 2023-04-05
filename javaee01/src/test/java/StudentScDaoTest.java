import com.javaee.dao.StudentScDao;
import com.javaee.po.Student;
import com.javaee.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class StudentScDaoTest {
    @Test
    public void findStudentScBySnoTest(){
        System.out.println("findStudentScBySnoTest:");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StudentScDao studentScDao = sqlSession.getMapper(StudentScDao.class);

        Student student = studentScDao.findStudentScBySno("100000001");
        System.out.println(student);
        sqlSession.close();
    }
}
