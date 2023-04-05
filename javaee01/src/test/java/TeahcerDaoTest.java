import com.javaee.dao.TeacherDao;
import com.javaee.po.Teacher;
import com.javaee.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TeahcerDaoTest {
    @Test
    public void findStudentBySnoTest() {
        System.out.println("findTeacherByTnoTest:");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        TeacherDao teacherDao = sqlSession.getMapper(TeacherDao.class);

        Teacher teacher = teacherDao.findTeacherByTno(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void findStudentAllTest() {
        System.out.println("findTeacherAllTest:");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        TeacherDao teacherDao = sqlSession.getMapper(TeacherDao.class);
        List<Teacher> teacherList = teacherDao.findTeacherAll();
        System.out.println(teacherList);
        sqlSession.close();
    }

    @Test
    public void findStudentBySnameTest() {
        System.out.println("findTeachherBytnameTest:");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        TeacherDao teacherDao = sqlSession.getMapper(TeacherDao.class);
        List<Teacher> teacherList = teacherDao.findTeachherBytname("云");
        System.out.println(teacherList);
        sqlSession.close();
    }

    @Test
    public void insertStudentTest() {
        System.out.println("insertTeacherTest:");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        TeacherDao teacherDao = sqlSession.getMapper(TeacherDao.class);

        Teacher teacher = new Teacher();
        teacher.setTno(4);
        teacher.setTname("张小三");
        teacher.setTsex("男");
        teacher.setTel("1382900135");
        int lines = teacherDao.insertTeacher(teacher);
        sqlSession.commit();
        sqlSession.close();
        System.out.println("成功插入了" + lines + "条记录");
    }

    @Test
    public void updateStudentTest() {
        System.out.println("updateTeacherTest:");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        TeacherDao teacherDao = sqlSession.getMapper(TeacherDao.class);

        Teacher teacher = new Teacher();
        teacher.setTno(4);
        teacher.setTname("李小四");
        teacher.setTsex("女");
        teacher.setTel("1352900135");
        int lines = teacherDao.updateTeacher(teacher);
        sqlSession.commit();
        sqlSession.close();
        System.out.println("成功更新了" + lines + "条记录");
    }

    @Test
    public void deleteStudentBySnoTest() {
        System.out.println("deleteTeacherByTnoTest:");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        TeacherDao teacherDao = sqlSession.getMapper(TeacherDao.class);

        int lines = teacherDao.deleteTeacherByTno(4);
        sqlSession.commit();
        sqlSession.close();
        System.out.println("成功删除了" + lines + "条记录");
    }
}
